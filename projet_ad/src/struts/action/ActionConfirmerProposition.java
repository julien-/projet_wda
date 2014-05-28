package struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.ActeurFilm;
import metier.Film;
import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

public class ActionConfirmerProposition extends Action {

	private DAOPersonne daoPersonne = null;
	private DAOActeurFilm daoActeurFilm = null;
	private DAOFilm daoFilm = null;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// Récupère les paramètres
		String sIdPersonne = (String) request.getParameter("ida");
		int idPersonne = Integer.valueOf(sIdPersonne);

		String sIdFilm = (String) request.getParameter("idf");
		int idFilm = Integer.valueOf(sIdFilm);
		
		//Film
		daoFilm = new DAOFilmHBM();
		Film film = daoFilm.get(idFilm);
		//Personne
		daoPersonne = new DAOPersonneHBM();
		Personne personne = daoPersonne.get(idPersonne);
		//ActeurFilm
		ActeurFilm acteurfilm = new ActeurFilm();
		acteurfilm.set_film(film);
		acteurfilm.set_acteur(personne);
		acteurfilm.set_confirme(1);
		//ActeurFilm
		daoActeurFilm = new DAOActeurFilmHBM();
		daoActeurFilm.update(acteurfilm);

		return mapping.findForward("confirm");
		
	}

	public DAOPersonne getDaoPersonn() {
		return daoPersonne;
	}

	public void setDaoPersonne(DAOPersonne daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	public DAOActeurFilm getDaoActeurFilm() {
		return daoActeurFilm;
	}

	public void setDaoActeurFilm(DAOActeurFilm daoActeurFilm) {
		this.daoActeurFilm = daoActeurFilm;
	}
	
	
}
