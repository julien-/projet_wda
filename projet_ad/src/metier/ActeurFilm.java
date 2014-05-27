package metier;

import java.io.Serializable;

public class ActeurFilm implements Serializable{

	private Personne _acteur;
	private Film _film;
	private int _confirme = 0;
	private String _id;
	
	public ActeurFilm() {
		// TODO Auto-generated constructor stub
	}
	
	public ActeurFilm(Personne acteur, Film film) 
	{
		// TODO Auto-generated constructor stub
		this._acteur = acteur;
		this._film = film;
	}

	public Personne get_acteur() {
		return _acteur;
	}

	public void set_acteur(Personne _acteur) {
		this._acteur = _acteur;
	}

	public Film get_film() {
		return _film;
	}

	public void set_film(Film _film) {
		this._film = _film;
	}

	public int get_confirme() {
		return _confirme;
	}

	public void set_confirme(int _confirme) {
		this._confirme = _confirme;
	}
	
	public String get_nom(){
		return this._acteur.get_nom();
	}
	
	public String get_prenom(){
		return this._acteur.get_prenom();
	}
	
	public String get_datenaiss(){
		return this._acteur.get_datenaiss();
	}
	
	public String get_photo(){
		return this._acteur.get_photo();
	}
	
	public String get_id(){
		return this._acteur.get_id()+"|"+this._film.get_id();
	}

	
}
