package struts.actionform;

import org.apache.struts.action.ActionForm;

public class ActionFormConfirmerProposition extends ActionForm
{
	String nom;
	String prenom;
	String date_naiss;
	String photo;
	Boolean checkboxValue;
	String _id;

	public ActionFormConfirmerProposition()
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

	public String getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(String date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public Boolean getCheckboxValue() {
		return checkboxValue;
	}

	public void setCheckboxValue(Boolean checkboxValue) {
		this.checkboxValue = checkboxValue;
	}
	
	public String get_id(){
		return _id;
	}


}
