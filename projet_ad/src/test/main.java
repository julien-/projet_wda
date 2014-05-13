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
			//daoPersonne.save(new Personne("nicolas", "galmiche", "1991-06-07"));
			daoFilm.save(new Film("Star Wars", 1978, 200000.1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
