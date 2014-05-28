package servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class AjoutRecompense
 */
@WebServlet("/AjouterRecompense")
public class AjouterRecompense extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterRecompense() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();		
		
		String id = request.getParameter("id");
		String type_recompense = request.getParameter("type_recompense");		

		try {			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Ajouter une Récompense</H1>");
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/AjouterRecompense>");
			
			out.println("Titre");
			out.println("<INPUT type=text name=titre>");
			out.println("Raison");
			out.println("<INPUT type=text name=raison>");
			out.println("Date");
			out.println("<INPUT type=text name=date>");
			out.println("Format AAAA");
			out.println("<INPUT type=hidden value="+type_recompense+" name=type_recompense >");
			out.println("<INPUT type=hidden value="+id+" name=id >");
			out.println("<INPUT type=submit value=valider>");
			
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
		
		String titre = request.getParameter("titre");
		String raison = request.getParameter("raison");
		String date = request.getParameter("date");
		String type_recompense = request.getParameter("type_recompense");
		String Id = request.getParameter("id");
		int id = Integer.parseInt(Id);
		
		DAOFilm daoFilm = new DAOFilmHBM();
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAORecompense daoRecompense = new DAORecompenseHBM();
		
		try {
			
			if (Outils.Outils.validateJavaDate(date, "yyyy") && titre != "" && raison != "")
			{
			
				if(type_recompense.equals("film"))
				{
					Film film = daoFilm.get(id);
					RecompenseFilm recompense = new RecompenseFilm(titre, raison, date);
					recompense.set_film(film);
					daoRecompense.save(recompense);				
				}
				else if(type_recompense.equals("personne"))
				{
					Personne personne = daoPersonne.get(id);
					RecompensePersonne recompense = new RecompensePersonne(titre, raison, date);
					recompense.set_personne(personne);
					daoRecompense.save(recompense);
				}
				response.sendRedirect("/projet_adw/vues/Success.jsp");
			}
			else
				out.println("Erreur");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
