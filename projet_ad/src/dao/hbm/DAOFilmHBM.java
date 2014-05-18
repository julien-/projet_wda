package dao.hbm;

import java.util.ArrayList;
import org.hibernate.Session;
import metier.Film;
import dao.DAOFilm;

public class DAOFilmHBM extends DAOHBM implements DAOFilm {

	@Override
	public Film get(int int_film) throws Exception {
		// TODO Auto-generated method stub
		Film film = null;
		Session session = connect();
		
		film = (Film)session.get(Film.class, int_film);
		
		close(session);
		return film;
	}

	@Override
	public void save(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(film);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from film").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Film> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Film>	tabIdFilm = (ArrayList<Film>) session.createQuery("FROM Film").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabIdFilm);

		return tabIdFilm;
	}

	@Override
	public void saveOrUpdate(Film film) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
