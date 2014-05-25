package test;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Realisateur;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.DAORecompense;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAORecompenseHBM;

public class main {

	public static void main(String[] args)
	{
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		DAORecompense daoRecompense = new DAORecompenseHBM();
		try 
		{
			Realisateur R1 = new Realisateur("Luc", "Besson", "1991-06-07");
			Film F1 = new Film("Titanic", 1997, 200000.1);
			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "MeilleurErzerzetzetrze musique", "2001");
			
			/*
			RecompensePersonne REC2 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
			
			daoRecompense.save(REC2);
			*/

			/*
			R1.getFilms().add(F1);
			System.out.println("HERE" + R1.get_id());
			daoPersonne.save(R1);
*/
			
			REC1.set_personne(R1);
			daoRecompense.save(REC1);
			
			REC2.set_film(F1);
			daoRecompense.save(REC2);
			

			System.out.println("fini");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
