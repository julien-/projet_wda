package struts.actionform;

import metier.Film;

import org.apache.struts.action.ActionForm;

public class ActionFormAjoutFilm extends ActionForm
{
	String titre;
	int cout;
	int annee;
	String fichier;

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

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	


}







