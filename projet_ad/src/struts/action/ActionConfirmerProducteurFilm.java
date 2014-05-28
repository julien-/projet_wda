package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ActeurFilm;
import metier.Film;
import metier.Personne;
import metier.ProducteurFilm;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAOProducteurFilm;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAOProducteurFilmHBM;

public class ActionConfirmerProducteurFilm extends Action{
	
	private DAOPersonne daoPersonne = null;
	private DAOProducteurFilm daoProducteurFilm = null;
	private DAOFilm daoFilm = null;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// Récupère les paramètres
		String sIdPersonne = (String) request.getParameter("idp");
		int idPersonne = Integer.valueOf(sIdPersonne);

		String sIdFilm = (String) request.getParameter("idf");
		int idFilm = Integer.valueOf(sIdFilm);
		
		//Film
		daoFilm = new DAOFilmHBM();
		Film film = daoFilm.get(idFilm);
		//Personne
		daoPersonne = new DAOPersonneHBM();
		Personne personne = daoPersonne.get(idPersonne);
		//ProducteurFilm
		ProducteurFilm producteurfilm = new ProducteurFilm();
		producteurfilm.set_film(film);
		producteurfilm.set_producteur(personne);
		producteurfilm.set_confirme(1);
		//ActeurFilm
		daoProducteurFilm = new DAOProducteurFilmHBM();
		daoProducteurFilm.update(producteurfilm);

		return mapping.findForward("confirm");
		
	}

	public DAOPersonne getDaoPersonn() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public DAOProducteurFilm getDaoActeurFilm() {
		return daoProducteurFilm;
	}

	public void setDaoActeurFilm(DAOProducteurFilm daoProducteurFilm) {
		this.daoProducteurFilm = daoProducteurFilm;
	}
	
}
