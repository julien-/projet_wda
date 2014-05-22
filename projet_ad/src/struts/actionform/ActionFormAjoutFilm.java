package struts.actionform;

import metier.Film;

import org.apache.struts.action.ActionForm;

public class ActionFormAjoutFilm extends ActionForm
{
	String titre;
	double cout;
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

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	


}







