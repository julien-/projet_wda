package metier;

import java.io.File;
import java.util.Calendar;

public class Film {
	String _titre;
	int _annéesortie, _nbrealisateur, _nbacteur, _nbproducteur, _cout;
	File _photoaffiche;
	
	//Constructeur sans photo
	public Film(String titre, int annéesortie, int nbrealisateur, int nbacteur, int nbproducteur, int cout) throws Exception {
		try{
			//tests
			if(titre.isEmpty())
				throw new Exception("Un film doit comporter un titre");
			if(annéesortie < 0)
				throw new Exception("Une date ne peut être négative");
			if(nbrealisateur < 0 )
				throw new Exception("Impossible de prédir la sortie d'un film");
			if(nbrealisateur < 0 )
				throw new Exception("Un nombre de réalisateur ne peut être négatif");
			if(nbacteur < 0 )
				throw new Exception("Un nombre d'acteurs ne peut être négatif");
			if(nbacteur < 0 )
				throw new Exception("Un nombre de producteurs ne peut être négatif");
			if(nbacteur < 0 )
				throw new Exception("Un coût ne peut être négatif");
			//construction
			this._titre = titre;
			this._annéesortie = annéesortie;
			this._nbrealisateur = nbrealisateur;
			this._nbacteur = nbacteur;
			this._nbproducteur = nbproducteur;
			this._cout = cout;
			
		}
		catch(Exception e)
        {
            System.out.println("Une exception s'est produite lors de la construction d'un Film : " + e);
        }
		
	}
	//Constructeur avec photo
	public Film(String titre, int annéesortie, int nbrealisateur, int nbacteur, int nbproducteur, int cout, File photoaffiche) throws Exception
	{
		//Appel du constructeur sans photo
		this(titre, annéesortie, nbrealisateur, nbacteur, nbproducteur, cout);
		
		try
		{
			//tests
			if(photoaffiche != null)
				_photoaffiche = photoaffiche;
			if(!photoaffiche.isFile())
				throw new Exception("Erreur dans la photo d'affiche");
		}
		catch(Exception e)
		{
			System.out.println("Une exception s'est produite lors de la création d'un Film avec photo : " + e);
		}
	}
	//Getter/Setter
	public String get_titre() {
		return _titre;
	}
	public void set_titre(String titre) {
		this._titre = titre;
	}
	public int get_annéesortie() {
		return _annéesortie;
	}
	public void set_annéesortie(int annéesortie) {
		this._annéesortie = annéesortie;
	}
	public int get_nbrealisateur() {
		return _nbrealisateur;
	}
	public void set_nbrealisateur(int nbrealisateur) {
		this._nbrealisateur = nbrealisateur;
	}
	public int get_nbacteur() {
		return _nbacteur;
	}
	public void set_nbacteur(int nbacteur) {
		this._nbacteur = nbacteur;
	}
	public int get_nbproducteur() {
		return _nbproducteur;
	}
	public void set_nb_producteur(int nbproducteur) {
		this._nbproducteur = nbproducteur;
	}
	public int get_cout() {
		return _cout;
	}
	public void set_cout(int cout) {
		this._cout = cout;
	}
	public File get_photoaffiche() {
		return _photoaffiche;
	}
	public void set_photoaffiche(File photoaffiche) {
		this._photoaffiche = photoaffiche;
	}
	//toString
	public String toString() {
		return "Film [_titre=" + _titre + ", _annéesortie=" + _annéesortie
				+ ", _nbrealisateur=" + _nbrealisateur + ", _nbacteur="
				+ _nbacteur + ", _nbproducteur=" + _nbproducteur + ", _cout="
				+ _cout + ", _photoaffiche=" + _photoaffiche + "]";
	}
	
	//Méthodes
	
	
}
