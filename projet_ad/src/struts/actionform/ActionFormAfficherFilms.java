package struts.actionform;

import metier.Film;

import org.apache.struts.action.ActionForm;

public class ActionFormAfficherFilms extends ActionForm
{
	String titre;
	
	public ActionFormAfficherFilms()
	{
	
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}
	


}
