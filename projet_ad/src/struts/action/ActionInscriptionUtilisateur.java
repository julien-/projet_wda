package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.IUtilisateur;
import metier.Producteur;
import metier.Realisateur;
import metier.Utilisateur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormInscriptionUtilisateur;
import dao.DAOUtilisateur;
import dao.hbm.DAOUtilisateurHBM;

public class  ActionInscriptionUtilisateur extends Action
{
	private DAOUtilisateur daoUtilisateur = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		IUtilisateur utilisateur = null;
		daoUtilisateur = new DAOUtilisateurHBM();
		ActionFormInscriptionUtilisateur formInscription = (ActionFormInscriptionUtilisateur)form;
		
		utilisateur = new Utilisateur(formInscription.getLogin(), formInscription.getPass());
		
		getDaoUtilisateur().save(utilisateur);
	
		return mapping.findForward("success");
	}

	public DAOUtilisateur getDaoUtilisateur() {
		return daoUtilisateur;
	}

	public void setDaoUtilisateur(DAOUtilisateur daoUtilisateur) {
		this.daoUtilisateur = daoUtilisateur;
	}
}