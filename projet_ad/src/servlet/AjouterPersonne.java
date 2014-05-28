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
 * Servlet implementation class AjouterPersonne
 */
@WebServlet("/AjouterPersonne")
public class AjouterPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterPersonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();		
		
		String id_film = request.getParameter("id_film");		
		String type_pers = request.getParameter("type_pers");		

		try {
			
			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Ajouter un "+type_pers+"</H1>");
			
			out.println("</FORM>");	
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/AjouterPersonne>");
			
			out.println("Nom");
			out.println("<INPUT type=text name=nom>");
			out.println("Prenom");
			out.println("<INPUT type=text name=prenom>");
			out.println("Date de naissance");
			out.println("<INPUT type=text name=date_naissance>");
			out.println("Format : JJ-MM-AAAA");
			out.println("<INPUT type=hidden value="+type_pers+" name=type_personne >");
			out.println("<INPUT type=hidden value="+id_film+" name=id_film >");
			out.println("Photo: <INPUT type=file name=photo >");
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
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String date_naissance = request.getParameter("date_naissance");
		String type_personne = request.getParameter("type_personne");
		String id_film = request.getParameter("id_film");
		String photo = request.getParameter("photo");
		int id = Integer.parseInt(id_film);
		
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		
		DAOProducteurFilm  daoProducteurFilm = new DAOProducteurFilmHBM();
		DAOActeurFilm  daoActeurFilm = new DAOActeurFilmHBM();
		DAORealisateurFilm  daoRealisateurFilm = new DAORealisateurFilmHBM();
		
		DAOFilm daoFilm = new DAOFilmHBM();
		
		try {
			
			if (Outils.Outils.validateJavaDate(date_naissance, "dd-MM-yyyy") && nom != "" && prenom != "")
			{
			
				Film film = daoFilm.get(id);
				
				
				if(type_personne.equals("acteur"))
				{
					Acteur pers = new Acteur(nom,prenom,date_naissance, photo);
					if (request.getSession().getAttribute("login") != null)
						pers.set_confirme(1);					
					daoPersonne.save(pers);
					ActeurFilm act = new ActeurFilm(pers, film);
					daoActeurFilm.save(act);	
					film.getActeurs().add(new ActeurFilm(pers, film));							
				}
				else if(type_personne.equals("producteur"))
				{
					Producteur pers = new Producteur(nom,prenom,date_naissance, photo);
					if (request.getSession().getAttribute("login") != null)
						pers.set_confirme(1);
					daoPersonne.save(pers);
					ProducteurFilm prod = new ProducteurFilm(pers, film);
					daoProducteurFilm.save(prod);
					film.getProducteurs().add(new ProducteurFilm(pers, film));				
				}
				else if(type_personne.equals("realisateur"))
				{
					Realisateur pers = new Realisateur(nom,prenom,date_naissance, photo);
					if (request.getSession().getAttribute("login") != null)
						pers.set_confirme(1);
					daoPersonne.save(pers);
					RealisateurFilm rea= new RealisateurFilm(pers, film);
					daoRealisateurFilm.save(rea);
					film.getRealisateurs().add(new RealisateurFilm(pers, film));				
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
