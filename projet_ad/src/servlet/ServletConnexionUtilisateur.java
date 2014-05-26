package servlet;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Utilisateur;
import dao.DAOUtilisateur;
import dao.hbm.DAOUtilisateurHBM;

public class ServletConnexionUtilisateur extends HttpServlet
{
	
	private static long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
		try
		{
			//Récupère le nom saisi par l'utilisateur
			String login = request.getParameter("login");
			//vérifie s'il existe dans la BDD
			DAOUtilisateur daoUtilisateur = new DAOUtilisateurHBM();
			ArrayList<Utilisateur> utilisateurs = daoUtilisateur.load(login);
			
			if(!utilisateurs.isEmpty())
			{//Existe dans la BDD
				//Récupère la session du client
				HttpSession session = request.getSession();
				session.setAttribute("login", login);
				//la requete est retransmise à un autre comosant (ici l'accueil pro)
				response.sendRedirect("http://localhost:8080/projet_adw/vues/AccueilPro.jsp");
			}
			else
			{	//N'existe pas dans la BDD
				//reste sur la page Bienvenue
				response.sendRedirect("http://localhost:8080/projet_adw/vues/Bienvenue.jsp");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
