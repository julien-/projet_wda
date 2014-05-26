package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDeconnexionUtilisateur {
	
	private static long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		try
		{
			//On supprime les attributs de la session
			request.getSession().invalidate();
			response.sendRedirect("http://localhost:8080/projet_adw/vues/Bienvenue.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
