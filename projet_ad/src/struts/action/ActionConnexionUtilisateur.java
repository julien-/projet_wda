package struts.action;

import java.rmi.Naming;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Acteur;
import metier.Film;
import metier.IUtilisateur;
import metier.Producteur;
import metier.Realisateur;
import metier.Utilisateur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import struts.actionform.ActionFormConnexionUtilisateur;
import struts.actionform.ActionFormInscriptionUtilisateur;
import dao.DAOUtilisateur;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOUtilisateurHBM;

public class  ActionConnexionUtilisateur extends Action
{
	private DAOUtilisateur daoUtilisateur = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		boolean answerReceived = false;
		String pageDestination = "";
		daoUtilisateur = new DAOUtilisateurHBM();
		ActionFormConnexionUtilisateur formInscription = (ActionFormConnexionUtilisateur)form;
		
		IUtilisateur utilisateur = new Utilisateur(formInscription.getLogin(), formInscription.getPass());
		System.out.println("bind");
		Naming.bind("rmi://localhost:1099/UTILISATEUR", utilisateur);

		while(!answerReceived)
		{
			try
			{
			utilisateur = (IUtilisateur) Naming.lookup("rmi://localhost:1099/REPONSE");
		
			answerReceived = true;
			if (utilisateur.getVerifie() == 1)
				pageDestination = "pro";
			else
				pageDestination = "fail";
			}
			catch(Exception e)
			{
			}
		}
		HttpSession session = request.getSession();
		session.setAttribute("id", utilisateur.get_id());
		session.setAttribute("login", utilisateur.get_pseudo());
		session.setAttribute("erreur", utilisateur.getVerifie());
		Naming.unbind("rmi://localhost:1099/REPONSE");
		return mapping.findForward(pageDestination);
	}

	public DAOUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public void setDaoUtilisateur(DAOUtilisateur daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}
}
