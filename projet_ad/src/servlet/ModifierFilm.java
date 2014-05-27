package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;
import metier.Personne;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

/**
 * Servlet implementation class ModifierFilm
 */
@WebServlet("/ModifierFilm")
public class ModifierFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierFilm() {
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
		
		DAOFilm daoFilm = new DAOFilmHBM();

		try {
			
			Film film = daoFilm.get(id);
			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Modifier "+film.get_titre()+"</H1>");
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/ModifierFilm>");
			
			out.println("Titre");
			out.println("<INPUT type=text name=titre value="+film.get_titre()+">");
			out.println("Cout");
			out.println("<INPUT type=text name=cout value="+film.get_cout()+">");
			out.println("Année sortie");
			out.println("<INPUT type=text name=date value="+film.get_anneesortie()+">");
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
		
		String titre = request.getParameter("titre");
		String Cout = request.getParameter("cout");
		int cout = Integer.parseInt(Cout);
		String Date = request.getParameter("date");	
		int date = Integer.parseInt(Date);
		String Id = request.getParameter("id");
		int id = Integer.parseInt(Id);
		
		DAOFilm daoFilm = new DAOFilmHBM();
		
		try {
			Film film = daoFilm.get(id);
			film.set_titre(titre);
			film.set_cout(cout);
			film.set_anneesortie(date);
			daoFilm.update(film);
			response.sendRedirect("/projet_adw/vues/Success.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
