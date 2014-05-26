package struts.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ActionFormConnexionUtilisateur extends ActionForm
{
		String login;
		String pass;

		public ActionFormConnexionUtilisateur()
		{
		
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPass() {
			return pass;
		}

		public void setPass(String pass) {
			this.pass = pass;
		}
		
		public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		    ActionErrors erreur = new ActionErrors();
		    if (request.getParameter("login") == null || request.getParameter("login").length() < 1) {
		        erreur.add("login", new ActionMessage("erreur.login.requis"));
		    }
		    if (request.getParameter("pass") == null || request.getParameter("pass").length() < 1) {
		        erreur.add("pass", new ActionMessage("erreur.pass.requis"));
		    }
		    return erreur;
		}
}