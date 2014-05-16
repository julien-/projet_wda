package test;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Realisateur;
import metier.Recompense;
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
			Recompense REC1 = new Recompense("Oscar", "Meilleur acteur", "2001");
			
			R1.getFilms().add(F1);
			System.out.println("HERE" + R1.get_id());
			daoPersonne.save(R1);
		 	
			
			/*
			daoFilm.save(F1);
			daoPersonne.save(R1);
			REC1.set_personne(R1);
			REC1.set_film(F1);
			daoRecompense.save(REC1);
			*/
			
			System.out.println("fini");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
