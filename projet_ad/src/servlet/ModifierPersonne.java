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
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAOProducteurFilm;
import dao.DAORealisateurFilm;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAOProducteurFilmHBM;
import dao.hbm.DAORealisateurFilmHBM;

/**
 * Servlet implementation class ModifierPersonne
 */
@WebServlet("/ModifierPersonne")
public class ModifierPersonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierPersonne() {
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

		try {
			
			Personne personne = daoPersonne.get(id);
			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Modifier "+personne.get_nom()+" "+ personne.get_prenom()+"</H1>");
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/ModifierPersonne>");
			
			out.println("Nom");
			out.println("<INPUT type=text name=nom value="+personne.get_nom()+">");
			out.println("Prenom");
			out.println("<INPUT type=text name=prenom value="+personne.get_prenom()+">");
			out.println("Date de naissance");
			out.println("<INPUT type=text name=date_naissance value="+personne.get_datenaiss()+">");
			out.println("Format : JJ-MM-AAAA");
			out.println("<INPUT type=hidden value="+Id+" name=id>");
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
		String Id = request.getParameter("id");
		int id = Integer.parseInt(Id);
		
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		
		try {
			
			if (Outils.Outils.validateJavaDate(date_naissance, "dd-MM-yyyy") && nom != "" && prenom != "")
			{
				Personne personne = daoPersonne.get(id);
				personne.set_nom(nom);
				personne.set_prenom(prenom);
				personne.set_datenaiss(date_naissance);
				daoPersonne.update(personne);
				response.sendRedirect("/projet_adw/vues/Success.jsp");
			}
			else
			{
				out.println("Erreur");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
