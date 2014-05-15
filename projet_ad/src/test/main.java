package test;

import metier.Film;
import metier.Personne;
import dao.DAOFilm;
import dao.DAOPersonne;
import dao.hbm.DAOFilmHBM;
import dao.hbm.DAOPersonneHBM;

public class main {

	public static void main(String[] args)
	{
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		DAOFilm daoFilm = new DAOFilmHBM();
		
		try {
			
			daoFilm.save(new Film("les boules Wars", 1978, 200000.1));
			daoPersonne.save(new Personne("fils", "depute", "1991-06-07"));
			
			System.out.println(daoPersonne.load("osef").toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
