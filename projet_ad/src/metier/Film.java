package metier;

import java.io.File;
import java.util.Calendar;

public class Film {
	String _titre;
	int _ann�esortie, _nbrealisateur, _nbacteur, _nbproducteur, _cout;
	File _photoaffiche;
	
	//Constructeur sans photo
	public Film(String titre, int ann�esortie, int nbrealisateur, int nbacteur, int nbproducteur, int cout) throws Exception {
		try{
			//tests
			if(titre.isEmpty())
				throw new Exception("Un film doit comporter un titre");
			if(ann�esortie < 0)
				throw new Exception("Une date ne peut �tre n�gative");
			if(nbrealisateur < 0 )
				throw new Exception("Impossible de pr�dir la sortie d'un film");
			if(nbrealisateur < 0 )
				throw new Exception("Un nombre de r�alisateur ne peut �tre n�gatif");
			if(nbacteur < 0 )
				throw new Exception("Un nombre d'acteurs ne peut �tre n�gatif");
			if(nbacteur < 0 )
				throw new Exception("Un nombre de producteurs ne peut �tre n�gatif");
			if(nbacteur < 0 )
				throw new Exception("Un co�t ne peut �tre n�gatif");
			//construction
			this._titre = titre;
			this._ann�esortie = ann�esortie;
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
	public Film(String titre, int ann�esortie, int nbrealisateur, int nbacteur, int nbproducteur, int cout, File photoaffiche) throws Exception
	{
		//Appel du constructeur sans photo
		this(titre, ann�esortie, nbrealisateur, nbacteur, nbproducteur, cout);
		
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
			System.out.println("Une exception s'est produite lors de la cr�ation d'un Film avec photo : " + e);
		}
	}
	//Getter/Setter
	public String get_titre() {
		return _titre;
	}
	public void set_titre(String titre) {
		this._titre = titre;
	}
	public int get_ann�esortie() {
		return _ann�esortie;
	}
	public void set_ann�esortie(int ann�esortie) {
		this._ann�esortie = ann�esortie;
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
		return "Film [_titre=" + _titre + ", _ann�esortie=" + _ann�esortie
				+ ", _nbrealisateur=" + _nbrealisateur + ", _nbacteur="
				+ _nbacteur + ", _nbproducteur=" + _nbproducteur + ", _cout="
				+ _cout + ", _photoaffiche=" + _photoaffiche + "]";
	}
	
	//M�thodes
	
	
}
