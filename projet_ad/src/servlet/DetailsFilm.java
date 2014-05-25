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
			
			Set<Acteur> tabActeurs= film.getActeurs();
			Set<Realisateur> tabRealisateurs= film.getRealisateurs();
			Set<Producteur> tabProducteurs= film.getProducteurs();
			
			out.println("<HTML><BODY><CENTER><H3>Fiche Film : "+ film.get_titre() +"</H3>");
			
			
			if(!tabActeurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Acteurs </CAPTION><TR><TH>Nom</TH><TH>Prénom</TH><TH>Date Naissance</TH></TR");
				for (Personne p : tabActeurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/>");
			}
			else
			{
				out.println("Aucun Acteur<BR/>");
			}
			
			
			if(!tabRealisateurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Réalisateurs </CAPTION><TR><TH>Nom</TH><TH>Prénom</TH><TH>Date Naissance</TH></TR");
				for (Personne p : tabRealisateurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/>");
			}
			else
			{
				out.println("Aucun Réalisateur<BR/>");
			}
			
			if(!tabProducteurs.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Producteurs </CAPTION><TR><TH>Nom</TH><TH>Prénom</TH><TH>Date Naissance</TH></TR");
				for (Personne p : tabProducteurs){
					HTMLLigneTableauP(out,p);
				}
				out.println("</TABLE><BR/>");
			}
			else
			{
				out.println("Aucun Producteur<BR/>");
			}
			
			if(!tabRecompense.isEmpty())
			{
				out.println("<TABLE border=\"1\"><CAPTION> Recompenses </CAPTION><TR><TH>Titre</TH><TH>Raison</TH><TH>Date</TH></TR");
				for (Recompense r : tabRecompense){
					HTMLLigneTableauR(out,r);
				}
				out.println("</TABLE><BR/>");
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
	
	private void HTMLLigneTableauP(PrintWriter out,Personne p){
		out.println("<TR><TD>"+p.get_nom()+"</TD><TD>"+p.get_prenom()+"</TD><TD>"+p.get_datenaiss()+"</TD><TD><A HREF=/projet_adw/DetailActeur?id="+p.get_id()+">Detail</A></TD></TR>");
	}
}
