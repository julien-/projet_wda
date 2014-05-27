package struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Personne;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import dao.DAOPersonne;

public class ActionConfirmerProposition extends Action{
	
	private DAOPersonne daoPersonne = null;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		ArrayList<Personne>	tabPersonne = daoPersonne.load("ddd");
		request.setAttribute("LISTE_PERSONNE", tabPersonne);
		
		return mapping.findForward("FormConfirmerProposition");
	}

}
