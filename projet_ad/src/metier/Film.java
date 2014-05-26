package metier;

import java.util.HashSet;
import java.util.Set;

public class Film {
	String _titre;
	int _anneesortie;
	double _cout;
	String _photoaffiche;
	int _id;
	int _confirme;
	
	private Set<ActeurFilm> acteurs = new HashSet<ActeurFilm>();
	private Set<RealisateurFilm> realisateurs = new HashSet<RealisateurFilm>();
	private Set<ProducteurFilm> producteurs = new HashSet<ProducteurFilm>();
	private Set<Note> _notes = new HashSet<Note>();

	public Set<ProducteurFilm> getProducteurs() {
		return producteurs;
	}
	public void setProducteurs(Set<ProducteurFilm> producteurs) {
		this.producteurs = producteurs;
	}
	public Set<Note> get_notes() {
		return _notes;
	}
	public Set<ActeurFilm> getActeurs() {
		return acteurs;
	}
	public void setActeurs(Set<ActeurFilm> acteurs) {
		this.acteurs = acteurs;
	}
	public void set_notes(Set<Note> _notes) {
		this._notes = _notes;
	}
	//Constructeur sans photo
	public Film(String titre, int anneesortie, double cout) throws Exception {
		try{
			//tests
			if(titre.isEmpty())
				throw new Exception("Un film doit comporter un titre");
			if(anneesortie < 0)
				throw new Exception("Une date ne peut être négative");
			
			//construction
			this._titre = titre;
			this._anneesortie = anneesortie;
			_confirme = 0;
			this._cout = cout;
			
		}
		catch(Exception e)
        {
            System.out.println("Une exception s'est produite lors de la construction d'un Film : " + e);
        }
		
	}
	//Constructeur avec photo
	public Film(String titre, int anneesortie, double cout, String photoaffiche) throws Exception
	{
		//Appel du constructeur sans photo
		this(titre, anneesortie, cout);
		_confirme = 0;
		try
		{
			//tests
			if(photoaffiche != null)
				_photoaffiche = photoaffiche;
		}
		catch(Exception e)
		{
			System.out.println("Une exception s'est produite lors de la création d'un Film avec photo : " + e);
		}
	}
	
	public Film()
	{;}
	
	public int get_confirme() {
		return _confirme;
	}
	public void set_confirme(int confirme) {
		this._confirme = confirme;
	}
	//Getter/Setter
	public int get_id() {
		return _id;
	}
	public void set_id(int id) {
		this._id = id;
	}
	public String get_titre() {
		return _titre;
	}
	public void set_titre(String titre) {
		this._titre = titre;
	}
	public int get_anneesortie() {
		return _anneesortie;
	}
	public void set_anneesortie(int anneesortie) {
		this._anneesortie = anneesortie;
	}
	public double get_cout() {
		return _cout;
	}
	public void set_cout(double cout) {
		this._cout = cout;
	}
	public String get_photoaffiche() {
		return _photoaffiche;
	}
	public void set_photoaffiche(String photoaffiche) {
		this._photoaffiche = photoaffiche;
	}
	//toString
	public String toString() {
		return "Film [_titre=" + _titre + ", _anneesortie=" + _anneesortie
				+ ", _cout="
				+ _cout + ", _photoaffiche=" + _photoaffiche + "]";
	}

	public Set<RealisateurFilm> getRealisateurs() {
		return realisateurs;
	}
	public void setRealisateurs(Set<RealisateurFilm> realisateurs) {
		this.realisateurs = realisateurs;
	}
	
	//Méthodes
	
	
}
