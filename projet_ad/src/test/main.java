package test;

import metier.Acteur;
import metier.Film;
import metier.Note;
import metier.Personne;
import metier.Producteur;
import metier.Realisateur;
import metier.Recompense;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.Utilisateur;
import dao.DAOFilm;
import dao.DAONote;
import dao.DAOPersonne;
import dao.DAORecompense;
import dao.DAOUtilisateur;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAONoteHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAORecompenseHBM;
import dao.hbm.DAOUtilisateurHBM;

public class main {

	public static void main(String[] args)
	{
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		DAORecompense daoRecompense = new DAORecompenseHBM();
		DAOUtilisateur daoUtilisateur = new DAOUtilisateurHBM();
		DAONote daoNote = new DAONoteHBM();
		try 
		{
			Realisateur R1 = new Realisateur("George", "Lucas", "1991-06-07");
			Acteur A1 = new Acteur("Ewan", "McGregor", "1966-06-02");
			Film F1 = new Film("Star Wars: La Menace Fantôme", 1997, 200000.1);
			Producteur P1 = new Producteur("George", "Lucas", "1968-8-2");
			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "1999");
			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "Meilleure musique", "1999");
			Utilisateur U1 = new Utilisateur("test", "test", 0);
			Note note = new Note(17);
			
			/*
			daoUtilisateur.save(U1);
			daoFilm.save(F1);
			note.set_film(F1);
			note.set_utilisateur(U1);
			daoNote.save(note);
			
			daoFilm.save(F1);
			R1.getFilms().add(F1);
			System.out.println("HERE" + R1.get_id());
			daoPersonne.save(R1);
			
			Film film = daoFilm.get(84);
			System.out.println(film.getRealisateurs().toString());
			A1.getFilms().add(film);
			daoPersonne.save(A1);
			
			System.out.println(film.getRealisateurs().toString());
			P1.getFilms().add(film);
			daoPersonne.save(P1);
			*/
			
			//daoUtilisateur.save(U1);
			/*
			REC1.set_personne(R1);
			daoRecompense.save(REC1);
			
			REC2.set_film(F1);
			daoRecompense.save(REC2);
			*/

			System.out.println("fini");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
