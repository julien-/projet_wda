package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.ActeurFilm;
import metier.Film;
import metier.Personne;
import metier.ProducteurFilm;
import metier.RealisateurFilm;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAOProducteurFilm;
import dao.DAORealisateurFilm;
import dao.DAORecompense;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAOProducteurFilmHBM;
import dao.hbm.DAORealisateurFilmHBM;
import dao.hbm.DAORecompenseHBM;

/**
 * Servlet implementation class LierPersonneFilm
 */
@WebServlet("/LierPersonneFilm")
public class LierPersonneFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LierPersonneFilm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();		
		
		String Id = request.getParameter("id");
		int id = Integer.parseInt(Id); 
		
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOFilm daoFilm = new DAOFilmHBM();

		try {
			
			Personne personne = daoPersonne.get(id);
			
			ArrayList<Film> tabFilms = daoFilm.load();
			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Lier une personne à un film</H1>");
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/LierPersonneFilm>");
			
			out.println("<LABEL>Lier "+personne.get_nom()+" "+personne.get_prenom()+" au film</LABEL>");
			out.println("<SELECT name=film>");
			for (Film f : tabFilms){
				HTMLLigneTableauF(out,f);
			}
			out.println("</SELECT>");
			out.println("<LABEL> en tant que </LABEL>");
			out.println("<SELECT name=personne>");
			out.println("<OPTION name=acteur>acteur</OPTION>");
			out.println("<OPTION name=producteur>producteur</OPTION>");
			out.println("<OPTION name=realisateur>realisateur</OPTION>");
			out.println("</SELECT>");
			
			out.println("<INPUT type=hidden value="+Id+" name=id>");
			
			out.println("<INPUT type=submit value=Lier>");
			
			out.println("</FORM>");			
			
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
		PrintWriter out = response.getWriter();
		
		String Id = request.getParameter("id");
		int id_pers = Integer.parseInt(Id);
		String type_personne = request.getParameter("personne");
		String IdF = request.getParameter("film");
		int id_film = Integer.parseInt(IdF);
		
		out.println(type_personne);
		
		
		DAOFilm daoFilm = new DAOFilmHBM();
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOActeurFilm daoActeurFilm = new DAOActeurFilmHBM();
		DAORealisateurFilm daoRealisateurFilm = new DAORealisateurFilmHBM();
		DAOProducteurFilm daoProducteurFilm = new DAOProducteurFilmHBM();
		
		try {
			
			Personne personne = daoPersonne.get(id_pers);
			Film film = daoFilm.get(id_film);
			
			if(type_personne.equals("acteur"))
			{
				ActeurFilm pers = new ActeurFilm();
				pers.set_acteur(personne);
				pers.set_film(film);
				daoActeurFilm.save(pers);
			}
			else if(type_personne.equals("realisateur"))
			{
				RealisateurFilm pers = new RealisateurFilm();
				pers.set_realisateur(personne);
				pers.set_film(film);
				daoRealisateurFilm.save(pers);
			}
			else if(type_personne.equals("producteur"))
			{
				ProducteurFilm pers = new ProducteurFilm();
				pers.set_producteur(personne);
				pers.set_film(film);
				daoProducteurFilm.save(pers);
			}
			response.sendRedirect("/projet_adw/vues/Success.jsp");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void HTMLLigneTableauF(PrintWriter out,Film f){
		out.println("<OPTION name=film value="+f.get_id()+">"+f.get_titre()+"</OPTION>");
	}
	
	

}
