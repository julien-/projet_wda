package struts.actionform;

import org.apache.struts.action.ActionForm;

public class ActionFormInscriptionUtilisateur extends ActionForm
{
		String login;
		String pass;

		public ActionFormInscriptionUtilisateur()
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
}