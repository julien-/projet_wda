package test;

import metier.Acteur;
import metier.ActeurFilm;
import metier.Film;
import metier.IUtilisateur;
import metier.Note;
import metier.Personne;
import metier.Producteur;
import metier.ProducteurFilm;
import metier.Realisateur;
import metier.RealisateurFilm;
import metier.RecompenseFilm;
import metier.RecompensePersonne;
import metier.Utilisateur;
import metier.toProducteur;
import dao.DAOActeurFilm;
import dao.DAOFilm;
import dao.DAONote;
import dao.DAOPersonne;
import dao.DAOProducteur;
import dao.DAOProducteurFilm;
import dao.DAORealisateurFilm;
import dao.DAORecompense;
import dao.DAOUtilisateur;
import dao.hbm.DAOActeurFilmHBM;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAONoteHBM;
import dao.hbm.DAOPersonneHBM;
import dao.hbm.DAOProducteurFilmHBM;
import dao.hbm.DAOProducteurHBM;
import dao.hbm.DAORealisateurFilmHBM;
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
		DAOActeurFilm daoAF = new DAOActeurFilmHBM();
		DAORealisateurFilm daoAR = new DAORealisateurFilmHBM();
		DAOProducteurFilm daoPF = new DAOProducteurFilmHBM();
		DAOProducteur daoProducteur = new DAOProducteurHBM();
		try 
		{
			Realisateur R1 = new Realisateur("Luc", "Besson", "1991-06-07");
			Film F1 = new Film("Titanic", 1997, 200000.1);
			Acteur A1 = new Acteur("Ewan", "McGregor", "1966-06-02");
			ActeurFilm AF = new ActeurFilm();
			RealisateurFilm AR = new RealisateurFilm();
			ProducteurFilm PF = new ProducteurFilm();
			Producteur P1 = new Producteur("George", "Lucas", "1968-8-2");
			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "1999");
			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "Meilleure musique", "1999");
			Utilisateur U1 = new Utilisateur("zerock", "zerock");
			Note note = new Note(17);
			daoFilm.save(F1);
			
			Personne Pt1 = daoPersonne.get(112);
			toProducteur toPd = new toProducteur();
			toPd.set_id(Pt1.get_id());
			daoProducteur.save(toPd);
			
		
			
			
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
			daoPersonne.save(P1);
			daoFilm.save(F1);
			P1.getFilms().add(PF);
			PF.set_producteur(P1);
			PF.set_film(F1);

			Acteur A2 = (Acteur) daoPersonne.get(112);
			
			System.out.println("HERE" + A1.get_id());
			daoPF.save(PF);

			if (daoUtilisateur.get("zerock", "zerock"))
			{
				System.out.println("trouve");
			}
			else
				System.out.println("pas trouve");
			
			REC1.set_personne(A1);
			daoRecompense.save(REC1);
			
			REC2.set_film(F1);
			daoRecompense.save(REC2);
			
			/*
			daoUtilisateur.save(U1);
			daoFilm.save(F1);
			note.set_film(F1);
			note.set_utilisateur(U1);
			daoNote.save(note);
			*/
			System.out.println("fini");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
