package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;
import dao.DAOPersonne;
import dao.hbm.DAOPersonneHBM;

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
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		String recherche=request.getParameter("nom");
		try {
			ArrayList<Personne> tabPersonne= daoPersonne.load(recherche);
			
			out.println("<HTML><BODY><CENTER><H1>Recherche des personnes</H1>");
			out.println("<TABLE border=\"1\"><TR><TH>Code</TH><TH>Nom</TH><TH>Prenom</TH><TH>Adresse</TH></TR");
			for (Personne p : tabPersonne){
				HTMLLigneTableau(out,p);
			}
			out.println("</TABLE></CENTER></BODY></HTML>");
			
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
	
	private void HTMLLigneTableau(PrintWriter out,Personne p){
		out.println("<TR><TD>"+p.get_nom()+"</TD><TD>"+p.get_prenom()+"</TD></TR>");
	}
}
