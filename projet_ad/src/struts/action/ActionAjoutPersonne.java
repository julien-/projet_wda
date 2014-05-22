package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Producteur;
import metier.Realisateur;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import struts.actionform.ActionFormAjoutFilm;
import struts.actionform.ActionFormAjoutPersonne;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

public class ActionAjoutPersonne extends Action
{
	private DAOPersonne daoPersonne = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		Personne personne = null;
		daoPersonne = new DAOPersonneHBM();
		ActionFormAjoutPersonne formAjout = (ActionFormAjoutPersonne)form;
		
		if (formAjout.getType().equals("acteur"))
			personne = new Acteur(formAjout.getNom(), formAjout.getPrenom(), formAjout.getAnnee());
		else if (formAjout.getType().equals("realisateur"))
			personne = new Realisateur(formAjout.getNom(), formAjout.getPrenom(), formAjout.getAnnee());
		else if (formAjout.getType().equals("producteur"))
			personne = new Producteur(formAjout.getNom(), formAjout.getPrenom(), formAjout.getAnnee());

		getDaoPersonne().save(personne);
	
		return mapping.findForward("success");
	}

	public DAOPersonne getDaoPersonne() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

}






