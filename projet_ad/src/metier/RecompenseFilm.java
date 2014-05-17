package metier;

public class RecompenseFilm extends Recompense {

	Film _film;
	public RecompenseFilm(String _titre, String _raison, String _annee) {
		super(_titre, _raison, _annee);
		// TODO Auto-generated constructor stub
	}

	public RecompenseFilm() {
		// TODO Auto-generated constructor stub
	}

	public Film get_film() {
		return _film;
	}

	public void set_film(Film _film) {
		this._film = _film;
	}

	
	
}
