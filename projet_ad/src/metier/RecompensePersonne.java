package metier;

public class RecompensePersonne extends Recompense {

	Personne _personne;
	public RecompensePersonne(String _titre, String _raison, String _annee) {
		super(_titre, _raison, _annee);
		// TODO Auto-generated constructor stub
	}

	public RecompensePersonne() {
		// TODO Auto-generated constructor stub
	}

	public Personne get_personne() {
		return _personne;
	}

	public void set_personne(Personne _personne) {
		this._personne = _personne;
	}

	
	
}
