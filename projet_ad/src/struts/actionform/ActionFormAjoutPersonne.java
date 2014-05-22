
package struts.actionform;

import metier.Film;

import org.apache.struts.action.ActionForm;

public class ActionFormAjoutPersonne extends ActionForm
{
	String nom;
	String prenom;
	String annee;
	String type;
	String film;

	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}
	public ActionFormAjoutPersonne()
	{
	
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	


}
