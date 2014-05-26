package struts.action;

import java.rmi.Naming;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		Naming.bind("UTILISATEUR", utilisateur);
		
		while(!answerReceived)
		{
			try
			{
			utilisateur = (IUtilisateur) Naming.lookup("rmi://localhost:1099/REPONSE");
		
			answerReceived = true;
			if (utilisateur.getVerifie() == 1)
				pageDestination = "success";
			else
				pageDestination = "fail";
			}
			catch(Exception e)
			{
			}
		}
		Naming.unbind("UTILISATEUR");
		return mapping.findForward(pageDestination);
	}

	public DAOUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public void setDaoUtilisateur(DAOUtilisateur daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}
}