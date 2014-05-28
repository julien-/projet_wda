package metier;

public class Recompense {

	int _id;
	String _titre;
	String _raison;
	String _annee;
	Personne _personne;
	Film _film;
	int _confirme = 0;
	
	public Recompense(String _titre, String _raison, String _annee) {
		super();
		this._titre = _titre;
		this._raison = _raison;
		this._annee = _annee;
	}

	public Recompense() {
		// TODO Auto-generated constructor stub
	}
	
	public int get_confirme() {
		return _confirme;
	}

	public void set_confirme(int _confirme) {
		this._confirme = _confirme;
	}

	
	public Personne get_personne() {
		return _personne;
	}

	public void set_personne(Personne _personne) {
		this._personne = _personne;
	}

	public Film get_film() {
		return _film;
	}

	public void set_film(Film _film) {
		this._film = _film;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_titre() {
		return _titre;
	}

	public void set_titre(String _titre) {
		this._titre = _titre;
	}

	public String get_raison() {
		return _raison;
	}

	public void set_raison(String _raison) {
		this._raison = _raison;
	}

	public String get_annee() {
		return _annee;
	}

	public void set_annee(String _annee) {
		this._annee = _annee;
	}


}
