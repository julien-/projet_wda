package test;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Realisateur;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

public class main {

	public static void main(String[] args)
	{
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		
		try 
		{
			Realisateur R1 = new Realisateur("Luc", "Besson", "1991-06-07");
			Film F1 = new Film("Titanic", 1997, 200000.1);
			// LALA.
			R1.getFilms().add(F1);
			System.out.println("HERE" + R1.get_id());
			daoPersonne.save(R1);
			System.out.println("fini");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
