package test;

import java.util.ArrayList;
import java.util.Iterator;

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
import metier.Recompense;
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

	public static void main(String[] args) throws Exception
	{
		Film film = new Film("lol", 1254, 146, "C:\\Users\\Nicolas\\Desktop\\Million.jpg");
		DAONote daoNote = new DAONoteHBM();
		DAOUtilisateur daoUtilisateur = new DAOUtilisateurHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		Film F1 = new Film("Titanic", 1997, 200000);
		Utilisateur U1 = new Utilisateur("zerock", "zerock");
		
		/*
		F1 = daoFilm.get(154);
		U1 = daoUtilisateur.get(5);
		
		Note note = new Note(18);
		note.set_film(F1);
		note.set_utilisateur(U1);
		
		daoNote.saveOrUpdate(note);
		*/
		
//		DAOPersonne daoPersonne = new DAOPersonneHBM();
//		DAOFilm daoFilm = new DAOFilmHBM();
//		DAORecompense daoRecompense = new DAORecompenseHBM();
//		DAOUtilisateur daoUtilisateur = new DAOUtilisateurHBM();
//		
//		DAOActeurFilm daoAF = new DAOActeurFilmHBM();
//
//		DAOProducteur daoProducteur = new DAOProducteurHBM();
//		DAOProducteurFilm daoProducteurFilm = new DAOProducteurFilmHBM();
//		DAORealisateurFilm daoRealisateurFilm = new DAORealisateurFilmHBM();
//		DAOActeurFilm daoActeurFilm = new DAOActeurFilmHBM();
//		try 
//		{
//			Realisateur R1 = new Realisateur("Luc", "Besson", "1991-06-07");
//			Film F1 = new Film("Titanic", 1997, 200000);
//			Acteur A1 = new Acteur("Ewan", "McGregor", "1966-06-02");
//
//			
//			Producteur P1 = new Producteur("George", "Lucas", "1968-8-2");
//			RecompensePersonne REC1 = new RecompensePersonne("Oscar", "Meilleur acteur", "1999");
//			RecompenseFilm REC2 = new RecompenseFilm("Oscar", "Meilleure musique", "1999");
//			Utilisateur U1 = new Utilisateur("zerock", "zerock");
//			Note note = new Note(17);
//
//			
//			/*
//			Personne Pt1 = daoPersonne.get(112);
//			toProducteur toPd = new toProducteur();
//			toPd.set_id(Pt1.get_id());
//			daoProducteur.save(toPd);
//			*/
//		
//			Personne pers = daoPersonne.get(112);
//			pers.set_nom("Connard");
//			daoPersonne.update(pers);
//			
//			
//			/* Chargement des recompenses */
//			
//			System.out.println(daoRecompense.loadAll().toString());
//			ArrayList<Recompense> tabRecompensesNonConfirmee = new ArrayList<Recompense>();
//			ArrayList<Recompense> tabRecompenses = daoRecompense.loadAll();
//			
//			
//			
//			RecompenseFilm RF;
//			RecompensePersonne RP;
//			Object obj;
//			Iterator i=tabRecompenses.iterator(); // on cr�e un Iterator pour parcourir notre HashSet
//			while(i.hasNext()) // tant qu'on a un suivant
//			{
//				obj = i.next();
//				if(obj.getClass().equals(RecompenseFilm.class))
//				{
//					RF = (RecompenseFilm)obj;
//					if (RF.get_confirme() == 0)
//						tabRecompensesNonConfirmee.add(RF);
//				}
//				else if (obj.getClass().equals(RecompensePersonne.class))
//				{
//					RP = (RecompensePersonne)obj;
//					if (RP.get_confirme() == 0)
//						tabRecompensesNonConfirmee.add(RP);
//				}
//			}
//			System.out.println(tabRecompensesNonConfirmee.toString());
//			
//			ProducteurFilm PF = new ProducteurFilm();
//			/* Chargement des producteurfilm */
//			ArrayList<ProducteurFilm> tabProdFilmNonConfirmes = new ArrayList<ProducteurFilm>();
//			ArrayList<ProducteurFilm> tabProdFilm = daoProducteurFilm.loadAll();
//			
//			i=tabProdFilm.iterator(); // on cr�e un Iterator pour parcourir notre HashSet
//			while(i.hasNext()) // tant qu'on a un suivant
//			{
//				PF = (ProducteurFilm)(i.next());
//				if (PF.get_confirme() == 0)
//					tabProdFilmNonConfirmes.add(PF);
//			}
//			System.out.println(tabProdFilmNonConfirmes.toString());
//			
//			
//			/* Chargement des acteurfilm */
//			ActeurFilm AF = new ActeurFilm();
//			ArrayList<ActeurFilm> tabActeurFilmNonConfirmes = new ArrayList<ActeurFilm>();
//			ArrayList<ActeurFilm> tabActeurFilm = daoActeurFilm.loadAll();
//			
//			i=tabActeurFilm.iterator(); // on cr�e un Iterator pour parcourir notre HashSet
//			while(i.hasNext()) // tant qu'on a un suivant
//			{
//				AF = (ActeurFilm)(i.next());
//				if (AF.get_confirme() == 0)
//					tabActeurFilmNonConfirmes.add(AF);
//			}
//			System.out.println(tabActeurFilmNonConfirmes.toString());
//			
//			/* Chargement des realisateurfilm */
//			RealisateurFilm REALF = new RealisateurFilm();
//			ArrayList<RealisateurFilm> tabRealFilmNonConfirmes = new ArrayList<RealisateurFilm>();
//			ArrayList<RealisateurFilm> tabRealFilm = daoRealisateurFilm.loadAll();
//			
//			i=tabRealFilm.iterator(); // on cr�e un Iterator pour parcourir notre HashSet
//			while(i.hasNext()) // tant qu'on a un suivant
//			{
//				REALF = (RealisateurFilm)(i.next());
//				if (REALF.get_confirme() == 0)
//					tabRealFilmNonConfirmes.add(REALF);
//			}
//			System.out.println(tabRealFilmNonConfirmes.toString());
//			
//			/*
//			RecompensePersonne REC2 = new RecompensePersonne("Oscar", "Meilleur acteur", "2001");
//			daoUtilisateur.save(U1);
//			daoFilm.save(F1);
//			note.set_film(F1);
//			note.set_utilisateur(U1);
//			daoNote.save(note);
//			
//			daoRecompense.save(REC2);
//			*/
//
//			/*
//			daoPersonne.save(P1);
//			daoFilm.save(F1);
//			P1.getFilms().add(PF);
//			PF.set_producteur(P1);
//			PF.set_film(F1);
//
//			Acteur A2 = (Acteur) daoPersonne.get(112);
//			
//			System.out.println("HERE" + A1.get_id());
//			daoPF.save(PF);
//
//			if (daoUtilisateur.get("zerock", "zerock"))
//			{
//				System.out.println("trouve");
//			}
//			else
//				System.out.println("pas trouve");
//			
//			REC1.set_personne(A1);
//			daoRecompense.save(REC1);
//			
//			REC2.set_film(F1);
//			daoRecompense.save(REC2);
//			
//			/*
//			daoUtilisateur.save(U1);
//			daoFilm.save(F1);
//			note.set_film(F1);
//			note.set_utilisateur(U1);
//			daoNote.save(note);
//			*/
//			System.out.println("fini");
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
