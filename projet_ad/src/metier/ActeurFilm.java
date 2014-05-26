package metier;

import java.io.Serializable;

public class ActeurFilm implements Serializable{

	private Acteur _acteur;
	private Film _film;
	private int _confirme = 0;
	
	public ActeurFilm() {
		// TODO Auto-generated constructor stub
	}

	public Acteur get_acteur() {
		return _acteur;
	}

	public void set_acteur(Acteur _acteur) {
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

	
}
