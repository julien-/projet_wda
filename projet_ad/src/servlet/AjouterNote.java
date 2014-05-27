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
import metier.Note;
import metier.Producteur;
import metier.ProducteurFilm;
import metier.Realisateur;
import metier.RealisateurFilm;
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAONote;
import dao.DAOPersonne;
import dao.DAOProducteurFilm;
import dao.DAORealisateurFilm;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAONoteHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAOProducteurFilmHBM;
import dao.hbm.DAORealisateurFilmHBM;

/**
 * Servlet implementation class AjouterNote
 */
@WebServlet("/AjouterNote")
public class AjouterNote extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();		
		
		String id_film = request.getParameter("id");
		int id = Integer.parseInt(id_film);
		
		DAOFilm daoFilm = new DAOFilmHBM();

		try {
			
			Film film = daoFilm.get(id);
			
			out.println("<HTML><BODY><CENTER>");
			
			out.println("<H1>Noter le film "+film.get_titre()+"</H1>");
			
			out.println("</FORM>");	
			
			out.println("<FORM METHOD=POST ACTION=/projet_adw/AjouterNote>");
			
			out.println("<LABEL>Note : </LABEL>");	
			
			out.println("<SELECT name=note>");
			for(int i=0; i<=10 ; i++)
				out.println("<OPTION>"+i+"</OPTION>");
			out.println("</SELECT>");
			
			out.println("<INPUT type=hidden value="+id_film+" name=id_film >");
			
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
		
		String Note = request.getParameter("note");
		int note = Integer.parseInt(Note);
		
		String id_film = request.getParameter("id_film");
		int id = Integer.parseInt(id_film);
		
		DAOFilm daoFilm = new DAOFilmHBM();
		DAONote daoNote = new DAONoteHBM();
		
		try {
			
			Film film = daoFilm.get(id);
			Note notee = new Note();
			notee.set_note(note);
			
			daoNote.save(notee);
			
			film.get_notes().add(notee);
			
			response.sendRedirect("/projet_adw/vues/Success.jsp");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
