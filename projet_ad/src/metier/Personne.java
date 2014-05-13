package metier;

import java.io.File;
import java.util.Date;

public class Personne {
	//Données membres
	private String _nom, _prenom;
	Date _datenaiss;
	File _photo;
	
	
	//Constructeur sans photo
	public Personne(String nom, String prenom, Date datenaiss) {
		try{
			//tests
			if(nom.isEmpty())
				throw new Exception("Une personne doit au minimum comporter un nom");
			if(prenom.isEmpty())
				throw new Exception("Une personne doit au minimum comporter un prénom");
			//construction
			this._nom = nom;
			this._prenom = prenom;
			this._datenaiss = datenaiss;
			this._photo = null;
		}
		catch(Exception e)
		{
			System.out.println("Une exception s'est produite lors de la construction d'une Personne : " + e);
		}
	}

	//Constructeur avec photo
	public Personne(String nom, String prenom, Date datenaiss, File photo) {
		//Appel du constructeur sans photo
		this(nom, prenom, datenaiss);
		try{
			//tests
			if(photo != null)
				this._photo = photo;
			if(!photo.isFile())
				throw new Exception("Erreur dans la photo");
		}
		catch(Exception e)
		{
			System.out.println("Une exception s'est produite lors de la construction d'une Personne avec photo: " + e);
		}
		
	}
	
	//Getter/Setter
	public String get_nom() {
		return _nom;
	}
	public void set_nom(String _nom) {
		this._nom = _nom;
	}
	public String get_prenom() {
		return _prenom;
	}
	public void set_prenom(String _prenom) {
		this._prenom = _prenom;
	}
	public Date get_date() {
		return _datenaiss;
	}
	public void set_date(Date _date) {
		this._datenaiss = _date;
	}
	public File get_photo() {
		return _photo;
	}
	public void set_photo(File _photo) {
		this._photo = _photo;
	}
	
	//ToString
	public String toString() {
		return "Personne [_nom=" + _nom + ", _prenom=" + _prenom + ", _date=" + _datenaiss + ", _photo=" + _photo +"]";
	}
	
}
