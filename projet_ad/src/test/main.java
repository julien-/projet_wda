package test;

import metier.Acteur;
import metier.Film;
import metier.Note;
import metier.Personne;
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
			Realisateur R1 = new Realisateur("Matt", "Damon", "1991-06-07");
			Film F1 = new Film("Soldat Ryan", 1997, 200000.1);
			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "Meilleure musique", "2001");
			Utilisateur U1 = new Utilisateur("test", "test", 0);
			Note note = new Note(12);
			
			/*
			daoUtilisateur.save(U1);
			daoFilm.save(F1);
			note.set_film(F1);
			note.set_utilisateur(U1);
			*/
			//daoNote.save(note);
			/*
			RecompensePersonne REC2 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
			
			daoRecompense.save(REC2);
			*/

			
			daoFilm.save(F1);
			R1.getFilms().add(F1);
			System.out.println("HERE" + R1.get_id());
			daoPersonne.save(R1);
			
			Film film = daoFilm.get(84);
			System.out.println(film.getRealisateurs().toString());
			
			
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
