package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Film;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import struts.actionform.ActionFormAjoutFilm;
import dao.DAOFilm;
import dao.hbm.DAOFilmHBM;

public class ActionAjoutFilm extends Action
{
	private DAOFilm daoFilms = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		daoFilms = new DAOFilmHBM();
		ActionFormAjoutFilm formAjout = (ActionFormAjoutFilm)form;
		
		
		if (Outils.Outils.validateJavaDate(Integer.toString(formAjout.getAnnee()), "yyyy") && formAjout.getTitre() != "" && formAjout.getCout() > 0)
		{
			Film film = new Film(formAjout.getTitre(), formAjout.getAnnee(), formAjout.getCout(), formAjout.getFichier());
			if (request.getSession().getAttribute("login") != null)
				film.set_confirme(1);
				
				getDaoFilms().save(film);
		
			return mapping.findForward("success");
		}
		else
			return mapping.findForward("fail");
	}

	public DAOFilm getDaoFilms() {
		return daoFilms;
	}

	public void setDaoFilms(DAOFilmHBM daoFilms) {
		this.daoFilms = daoFilms;
	}
}