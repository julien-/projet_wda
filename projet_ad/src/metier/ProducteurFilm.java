package metier;

import java.io.Serializable;

public class ProducteurFilm implements Serializable{

	private Personne _producteur;
	private Film _film;
	private int _confirme = 0;
	
	public ProducteurFilm() {
		// TODO Auto-generated constructor stub
	}

	public ProducteurFilm(Producteur producteur, Film film) {
		// TODO Auto-generated constructor stub
		this._producteur = producteur;
		this._film = film;
	}


	public Personne get_producteur() {
		return _producteur;
	}




	public void set_producteur(Personne _producteur) {
		this._producteur = _producteur;
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
