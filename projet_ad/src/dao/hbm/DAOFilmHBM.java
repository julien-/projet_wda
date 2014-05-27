package dao.hbm;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;

import metier.Film;
import metier.Personne;
import dao.DAOFilm;
import dao.DAOPersonne;

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
		ArrayList<Film>	tabIdFilm = (ArrayList<Film>) session.createQuery("FROM Film WHERE titre_film LIKE :search").setParameter("search", "%"+string+"%").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabIdFilm);
		
		return tabIdFilm;
	}
	
	public ArrayList<Film> load(int id) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Film>	tabIdFilm = (ArrayList<Film>) session.createQuery("FROM Film WHERE id_film_film LIKE :search").setParameter("search", "%"+id+"%").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabIdFilm);
		
		return tabIdFilm;
	}

	@Override
	public void saveOrUpdate(Film film) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Film film) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.update(film);
		close(session);
	}

}
