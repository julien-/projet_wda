package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAORecompense;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAORecompenseHBM;

/**
 * Servlet implementation class maServlet
 */
@WebServlet("/DetailsFilm")
public class DetailsFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailsFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		DAORecompense daoRecompense = new DAORecompenseHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		
		String recherche=request.getParameter("id");
		int id = Integer.parseInt(recherche); 
		try {
			
			Film film = daoFilm.get(id);
			ArrayList<Recompense> tabRecompense= daoRecompense.loadrecfilm(id);
			
			ArrayList<Personne> tabActeurs = new ArrayList<Personne>();
			ArrayList<Personne> tabRealisateurs = new ArrayList<Personne>();
			ArrayList<Personne> tabProducteurs = new ArrayList<Personne>();
			
			Iterator ia=film.getActeurs().iterator(); // on crée un Iterator pour parcourir notre HashSet
			while(ia.hasNext()) // tant qu'on a un suivant
			{
				Object obj = ia.next();
				ActeurFilm AF = (ActeurFilm)obj;
				System.out.println(AF.get_acteur().get_nom());
				tabActeurs.add(AF.get_acteur());
			}

			
			Iterator ip=film.getProducteurs().iterator(); // on crée un Iterator pour parcourir notre HashSet
			while(ip.hasNext()) // tant qu'on a un suivant
			{
				Object objP = ip.next();
				ProducteurFilm PF = (ProducteurFilm)objP;
				System.out.println(PF.get_producteur().get_nom());
				tabProducteurs.add(PF.get_producteur());
			}
			
			
			Iterator ir=film.getRealisateurs().iterator(); // on crée un Iterator pour parcourir notre HashSet
			while(ir.hasNext()) // tant qu'on a un suivant
			{
				Object objR = ir.next();
				RealisateurFilm RF = (RealisateurFilm)objR;
				System.out.println(RF.get_realisateur().get_nom());
				tabRealisateurs.add(RF.get_realisateur());
			}
			
			out.println("<HTML><BODY><CENTER>");
			out.println("<H1>Fiche Film : "+ film.get_titre() +"</H1>");
			out.println("<A HREF=/projet_adw/ModifierFilm?id="+film.get_id()+">Modifier</A>");
			out.println("<H3>Cout : "+ film.get_cout() +" $</H3>");
			out.println("<H3>Date de sortie : "+ film.get_anneesortie() +"</H3>");
			
			if(!tabActeurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Acteurs </CAPTION>");
				for (Personne p : tabActeurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/>");
			}
			else
			{
				out.println("Aucun Acteur<BR/><BR/>");
			}
			out.println("<A HREF=/projet_adw/AjouterPersonne?id_film="+film.get_id()+"&type_pers=acteur>Ajouter Acteur</A><BR/><BR/>");
			
			if(!tabRealisateurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Réalisateurs </CAPTION>");
				for (Personne p : tabRealisateurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/><BR/>");
			}
			else
			{
				out.println("Aucun Réalisateur<BR/><BR/>");
			}
			out.println("<A HREF=/projet_adw/AjouterPersonne?id_film="+film.get_id()+"&type_pers=realisateur>Ajouter Realisateur</A><BR/><BR/>");
			
			if(!tabProducteurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Producteurs </CAPTION>");
				for (Personne p : tabProducteurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/><BR/>");
			}
			else
			{
				out.println("Aucun Producteur<BR/><BR/>");
			}
			out.println("<A HREF=/projet_adw/AjouterPersonne?id_film="+film.get_id()+"&type_pers=producteur>Ajouter Producteur</A><BR/><BR/>");
			
			if(!tabRecompense.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Récompenses </CAPTION>");
				for (Recompense r : tabRecompense){
					HTMLLigneTableauR(out,r);
				}
				out.println("</TABLE>");
			}
			else
			{
				out.println("Aucune récompense");
			}
			out.println("<BR/><BR/><A HREF=/projet_adw/AjouterRecompense?id="+film.get_id()+"&type_recompense=film>Ajouter Récompense</A><BR/><BR/>");
			
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
	
	private void HTMLLigneTableauP(PrintWriter out,Personne p){
		out.println("<TR><TD><CENTER><A HREF=/projet_adw/DetailPersonne?id="+p.get_id()+">"+p.get_prenom() + " " + p.get_nom()+"</A></CENTER></TD></TR>");
	}
}
