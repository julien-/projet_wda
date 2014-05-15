package metier;

import java.io.File;
import java.util.Calendar;

public class Film {
	String _titre;
	int _anneesortie;
	double _cout;
	String _photoaffiche;
	int _id;
	
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
	
	//Méthodes
	
	
}
