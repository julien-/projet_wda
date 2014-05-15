package metier;

import java.io.File;
import java.util.Date;

public class Personne {
	//Données membres
	private String _nom, _prenom;
	String _datenaiss;
	String _photo;
	int _id;
	
	
	//Constructeur sans photo
	public Personne(String nom, String prenom, String datenaiss) {
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
	public Personne(String nom, String prenom, String datenaiss, String photo) {
		//Appel du constructeur sans photo
		this(nom, prenom, datenaiss);
		try{
			//tests
			if(photo != null)
				this._photo = photo;
		}
		catch(Exception e)
		{
			System.out.println("Une exception s'est produite lors de la construction d'une Personne avec photo: " + e);
		}
		
	}
	
	public Personne()
	{;}
	//Getter/Setter
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
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
	public String get_datenaiss() {
		return _datenaiss;
	}
	public void set_datenaiss(String _date) {
		this._datenaiss = _date;
	}
	public String get_photo() {
		return _photo;
	}
	public void set_photo(String _photo) {
		this._photo = _photo;
	}
	
	//ToString
	public String toString() {
		return "Personne [_nom=" + _nom + ", _prenom=" + _prenom + ", _date=" + _datenaiss + ", _photo=" + _photo +"]";
	}
	
}
