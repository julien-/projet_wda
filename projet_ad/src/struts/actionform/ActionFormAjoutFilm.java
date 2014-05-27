package struts.actionform;

import metier.Film;

import org.apache.struts.action.ActionForm;

public class ActionFormAjoutFilm extends ActionForm
{
	String titre;
	int cout;
	int annee;


	public ActionFormAjoutFilm()
	{
	
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getCout() {
		return cout;
	}

	public void setCout(int cout) {
		this.cout = cout;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	


}







