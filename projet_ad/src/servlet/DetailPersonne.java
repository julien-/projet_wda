package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Producteur;
import metier.Realisateur;
import metier.Recompense;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAORecompense;
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
		
		String recherche=request.getParameter("id");
		int id = Integer.parseInt(recherche); 
		try {
			
			Personne personne = daoPersonne.get(id);
			ArrayList<Recompense> tabRecompense= daoRecompense.loadrecpersonne(id);
			Set<Film> tabFilm = null;
			
			String typepersonne = "";
			
			if(personne.getClass().equals(Acteur.class))
			{
				Acteur acteur = (Acteur) personne;
				tabFilm = acteur.getFilms();
				typepersonne="Acteur";
			}
			else if(personne.getClass().equals(Realisateur.class))
			{
				Realisateur realisateur = (Realisateur) personne;
				tabFilm = realisateur.getFilms();
				typepersonne="Realisateur";
			}
			else if(personne.getClass().equals(Producteur.class))
			{
				Producteur producteur = (Producteur) personne;
				tabFilm = producteur.getFilms();
				typepersonne="Producteur";
			}
			
			out.println("<HTML><BODY><CENTER>");
			out.println("<H1>Fiche "+ typepersonne +" : "+ personne.get_nom() +" "+ personne.get_prenom() +"</H1>");
			out.println("<H3>Date naissance : "+ personne.get_datenaiss() +"</H3>");
			
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
