package metier;

import java.io.Serializable;

public class RealisateurFilm implements Serializable{

	private Realisateur _realisateur;
	private Film _film;
	private int _confirme = 0;
	
	public RealisateurFilm() {
		// TODO Auto-generated constructor stub
	}


	public Realisateur get_realisateur() {
		return _realisateur;
	}


	public void set_realisateur(Realisateur _realisateur) {
		this._realisateur = _realisateur;
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
