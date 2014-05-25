package test;

import metier.Acteur;
import metier.Film;
import metier.Note;
import metier.Producteur;
import metier.Realisateur;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.Utilisateur;
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
			Acteur A1 = new Acteur("Ewan", "McGregor", "1966-06-02");
			
			Producteur P1 = new Producteur("George", "Lucas", "1968-8-2");
			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "1999");
			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "Meilleure musique", "1999");
			Utilisateur U1 = new Utilisateur("test2", "test2");
			Note note = new Note(17);

			/*
			RecompensePersonne REC2 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
			daoUtilisateur.save(U1);
			daoFilm.save(F1);
			note.set_film(F1);
			note.set_utilisateur(U1);
			daoNote.save(note);
			
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
