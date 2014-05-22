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
import dao.DAOFilm;
import dao.hbm.DAOFilmHBM;

public class ActionAfficherFilms extends Action
{
	private DAOFilm daoFilms = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		daoFilms = new DAOFilmHBM();
		ActionFormAfficherFilms formRecherche = (ActionFormAfficherFilms)form;
		

		ArrayList<Film> tabFilms = getDaoFilms().load(formRecherche.getTitre());
		
		request.getSession().setAttribute("FILMS", tabFilms);
		
		System.out.println("Get Annonce = "+tabFilms.toString());

		
		return mapping.findForward("AfficherFilms");
	}

	public DAOFilm getDaoFilms() {
		return daoFilms;
	}

	public void setDaoFilms(DAOFilmHBM daoFilms) {
		this.daoFilms = daoFilms;
	}

}
