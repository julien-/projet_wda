package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.Film;
import metier.Producteur;
import metier.Realisateur;
import metier.Utilisateur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import struts.actionform.ActionFormInscriptionUtilisateur;
import dao.DAOUtilisateur;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOUtilisateurHBM;

public class  ActionConnexionUtilisateur extends Action
{
	private DAOUtilisateur daoUtilisateur = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//A REFAIRE CAR NE FAIS QUE LOAD TOUS LES UTILISATEURS
		daoUtilisateur = new DAOUtilisateurHBM();
		ActionFormInscriptionUtilisateur formInscription = (ActionFormInscriptionUtilisateur)form;
		
		ArrayList<Utilisateur> tabUtilisateur = getDaoUtilisateur().load(formInscription.getLogin());
		
		request.getSession().setAttribute("UTILISATEURS", tabUtilisateur);
		
		System.out.println("Get Utilisateur = "+tabUtilisateur.toString());
		
		return mapping.findForward("success");
		
		
	}

	public DAOUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public void setDaoUtilisateur(DAOUtilisateur daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}
}