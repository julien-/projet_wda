package dao.hbm;

import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;

import org.hibernate.Session;

import dao.DAOActeurFilm;

public class DAOActeurFilmHBM extends DAOHBM implements DAOActeurFilm{

	@Override
	public void save(ActeurFilm acteurFilm) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(acteurFilm);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from acteur_film").uniqueResult();
		return compteur;
	}
	

	public ArrayList<ActeurFilm> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<ActeurFilm>	tabNote = (ArrayList<ActeurFilm>) session.createQuery("FROM acteur_film").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabNote);

		return tabNote;
	}

	@Override
	public void saveOrUpdate(ActeurFilm acteur_film) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
