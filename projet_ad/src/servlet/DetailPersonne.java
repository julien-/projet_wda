package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.ActeurFilm;
import metier.Film;
import metier.Personne;
import metier.Producteur;
import metier.ProducteurFilm;
import metier.Realisateur;
import metier.RealisateurFilm;
import metier.Recompense;
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAORecompense;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAORecompenseHBM;

/**
 * Servlet implementation class DetailActeur
 */
@WebServlet("/DetailPersonne")
public class DetailPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAORecompense daoRecompense = new DAORecompenseHBM();
		//DAOFilm daoFilm = new DAOFilmHBM();
		//DAOActeurFilm daoActeurFilm = new DAOActeurFilmHBM();
		
		String recherche=request.getParameter("id");
		int id = Integer.parseInt(recherche); 
		try {
			
			Personne personne = daoPersonne.get(id);			
			
			personne.set_popularite(personne.get_popularite() + 1);
			daoPersonne.update(personne);
			
			ArrayList<Recompense> tabRecompense= daoRecompense.loadrecpersonne(id);
			Set<Film> tabFilm = new HashSet<Film>();
			
			String typepersonne = "";
			Object obj;
			ActeurFilm AF;
			ProducteurFilm PF;
			RealisateurFilm RF;
			
			if(personne.getClass().equals(Acteur.class))
			{
				Acteur acteur = (Acteur) personne;
				Iterator i=acteur.getFilms().iterator(); // on crée un Iterator pour parcourir notre HashSet
				while(i.hasNext()) // tant qu'on a un suivant
				{
					obj = i.next();
					AF = (ActeurFilm)obj;
					tabFilm.add(AF.get_film());
				}
				typepersonne="Acteur";
			}
			else if(personne.getClass().equals(Realisateur.class))
			{
				Realisateur realisateur = (Realisateur) personne;
				Iterator i=realisateur.getFilms().iterator(); // on crée un Iterator pour parcourir notre HashSet
				while(i.hasNext()) // tant qu'on a un suivant
				{
					obj = i.next();
					RF = (RealisateurFilm)obj;
					tabFilm.add(RF.get_film());
				}
				typepersonne="Realisateur";
			}
			else if(personne.getClass().equals(Producteur.class))
			{
				Producteur producteur = (Producteur) personne;
				Iterator i=producteur.getFilms().iterator(); // on crée un Iterator pour parcourir notre HashSet
				while(i.hasNext()) // tant qu'on a un suivant
				{
					obj = i.next();
					PF = (ProducteurFilm)obj;
					tabFilm.add(PF.get_film());
				}
				typepersonne="Producteur";
			}
			
			out.println("<HTML><BODY><CENTER>");
			out.println("<H1>Fiche "+ typepersonne +" : "+ personne.get_prenom() +" "+ personne.get_nom() +"</H1>");
			out.println("<IMG src=\""+ personne.get_photo() +"\"/><BR/>");
			out.println("<A HREF=/projet_adw/ModifierPersonne?id="+personne.get_id()+">Modifier</A>");
			out.println("<H3>Date naissance : "+ personne.get_datenaiss() +"</H3>");
			out.println("<H3>Popularité : "+ personne.get_popularite() +"</H3>");
			
			if(!tabFilm.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Films </CAPTION><TR><TH>Titre</TH><TH>Cout</TH><TH>Date sortie</TH></TR");
				for (Film f : tabFilm){
					HTMLLigneTableauF(out,f);
				}
				out.println("</TABLE><BR/><BR/>");
			}
			else
			{
				out.println("Aucun Film<BR/><BR/>");
			}
			out.println("<A HREF=/projet_adw/LierPersonneFilm?id="+personne.get_id()+">Lier à un autre film</A><BR/><BR/>");
			
			if(!tabRecompense.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Recompenses </CAPTION><TR><TH>Titre</TH><TH>Raison</TH><TH>Date</TH></TR");
				for (Recompense r : tabRecompense){
					HTMLLigneTableauR(out,r);
				}
				out.println("</TABLE>");
			}
			else
			{
				out.println("Aucune récompense");
			}
			out.println("<BR/><BR/><A HREF=/projet_adw/AjouterRecompense?id="+personne.get_id()+"&type_recompense=personne>Ajouter Récompense</A><BR/><BR/>");
			
			out.println("</CENTER></BODY></HTML>");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	private void HTMLLigneTableauR(PrintWriter out,Recompense r){
		out.println("<TR><TD>"+r.get_titre()+"</TD><TD>"+r.get_raison()+"</TD><TD>"+r.get_annee()+"</TD></TR>");
	}
	
	private void HTMLLigneTableauF(PrintWriter out,Film f){
		out.println("<TR><TD>"+f.get_titre()+"</TD><TD>"+f.get_cout()+"</TD><TD>"+f.get_anneesortie()+"</TD><TD><A HREF=/projet_adw/DetailsFilm?id="+f.get_id()+">Detail</A></TD></TR>");
	}

}
