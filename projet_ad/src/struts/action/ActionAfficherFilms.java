package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import metier.Film;
import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

public class ActionAfficherFilms extends Action
{
	private DAOFilm daoFilms = null;
	private DAOPersonne daoPersonne = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		daoFilms = new DAOFilmHBM();
		daoPersonne = new DAOPersonneHBM();
		ActionFormAfficherFilms formRecherche = (ActionFormAfficherFilms)form;
		
		ArrayList<Film> tabFilms = getDaoFilms().load(formRecherche.getTitre());
		
		if(!tabFilms.isEmpty())
		{
			request.getSession().setAttribute("FILMS", tabFilms);
			HttpSession session = request.getSession();
			ArrayList<Personne> tabPers = new ArrayList<Personne>();
			if (session.getAttribute("login") != null)
			{
				tabPers = daoPersonne.load(formRecherche.getTitre());
				request.getSession().setAttribute("PERSONNES", tabPers);
			}
			
			return mapping.findForward("AfficherFilms");
		}
		else
			return mapping.findForward("AucunResultat");
	}

	public DAOFilm getDaoFilms() {
		return daoFilms;
	}

	public void setDaoFilms(DAOFilmHBM daoFilms) {
		this.daoFilms = daoFilms;
	}

}
