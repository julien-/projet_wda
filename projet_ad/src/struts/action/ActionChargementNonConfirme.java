package struts.action;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Acteur;
import metier.ActeurFilm;
import metier.Film;
import metier.ProducteurFilm;
import metier.RealisateurFilm;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.actionform.ActionFormAfficherFilms;
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAOProducteurFilm;
import dao.DAORealisateurFilm;
import dao.DAORecompense;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOProducteurFilmHBM;
import dao.hbm.DAORealisateurFilmHBM;
import dao.hbm.DAORecompenseHBM;

public class ActionChargementNonConfirme extends Action
{
	private DAOPersonne daoPersonne = null;
	private DAORecompense daoRecompense = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{

		DAOProducteurFilm daoProducteurFilm = new DAOProducteurFilmHBM();
		DAORealisateurFilm daoRealisateurFilm = new DAORealisateurFilmHBM();
		DAOActeurFilm daoActeurFilm = new DAOActeurFilmHBM();
		
		/* Chargement des recompenses */
		System.out.println(daoRecompense.loadAll().toString());
		ArrayList<Recompense> tabRecompensesNonConfirmee = new ArrayList<Recompense>();
		ArrayList<Recompense> tabRecompenses = daoRecompense.loadAll();
		
		
		
		RecompenseFilm RF;
		RecompensePersonne RP;
		Object obj;
		Iterator i=tabRecompenses.iterator(); // on crée un Iterator pour parcourir notre HashSet
		while(i.hasNext()) // tant qu'on a un suivant
		{
			obj = i.next();
			if(obj.getClass().equals(RecompenseFilm.class))
			{
				RF = (RecompenseFilm)obj;
				if (RF.get_confirme() == 0)
					tabRecompensesNonConfirmee.add(RF);
			}
			else if (obj.getClass().equals(RecompensePersonne.class))
			{
				RP = (RecompensePersonne)obj;
				if (RP.get_confirme() == 0)
					tabRecompensesNonConfirmee.add(RP);
			}
		}
		System.out.println(tabRecompensesNonConfirmee.toString());
		
		ProducteurFilm PF = new ProducteurFilm();
		/* Chargement des producteurfilm */
		ArrayList<ProducteurFilm> tabProdFilmNonConfirmes = new ArrayList<ProducteurFilm>();
		ArrayList<ProducteurFilm> tabProdFilm = daoProducteurFilm.loadAll();
		
		i=tabProdFilm.iterator(); // on crée un Iterator pour parcourir notre HashSet
		while(i.hasNext()) // tant qu'on a un suivant
		{
			PF = (ProducteurFilm)(i.next());
			if (PF.get_confirme() == 0)
				tabProdFilmNonConfirmes.add(PF);
		}
		System.out.println(tabProdFilmNonConfirmes.toString());
		
		
		/* Chargement des acteurfilm */
		ActeurFilm AF = new ActeurFilm();
		ArrayList<ActeurFilm> tabActeurFilmNonConfirmes = new ArrayList<ActeurFilm>();
		ArrayList<ActeurFilm> tabActeurFilm = daoActeurFilm.loadAll();
		
		i=tabActeurFilm.iterator(); // on crée un Iterator pour parcourir notre HashSet
		while(i.hasNext()) // tant qu'on a un suivant
		{
			AF = (ActeurFilm)(i.next());
			if (AF.get_confirme() == 0)
				tabActeurFilmNonConfirmes.add(AF);
		}
		System.out.println(tabActeurFilmNonConfirmes.toString());
		
		/* Chargement des realisateurfilm */
		RealisateurFilm REALF = new RealisateurFilm();
		ArrayList<RealisateurFilm> tabRealFilmNonConfirmes = new ArrayList<RealisateurFilm>();
		ArrayList<RealisateurFilm> tabRealFilm = daoRealisateurFilm.loadAll();
		
		i=tabRealFilm.iterator(); // on crée un Iterator pour parcourir notre HashSet
		while(i.hasNext()) // tant qu'on a un suivant
		{
			REALF = (RealisateurFilm)(i.next());
			if (REALF.get_confirme() == 0)
				tabRealFilmNonConfirmes.add(REALF);
		}
		
		System.out.println(tabRealFilmNonConfirmes.toString());
		
		request.getSession().setAttribute("RECOMPENSES", tabRecompensesNonConfirmee);
		request.getSession().setAttribute("ACTEURFILM", tabActeurFilmNonConfirmes);
		request.getSession().setAttribute("PRODUCTEURFILM", tabProdFilmNonConfirmes);
		request.getSession().setAttribute("REALISATEURFILM", tabRealFilmNonConfirmes);
		
		return mapping.findForward("FormulaireConfirmation");
	}


}
