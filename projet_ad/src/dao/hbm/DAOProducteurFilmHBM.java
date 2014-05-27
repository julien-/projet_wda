package dao.hbm;

import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;
import metier.ProducteurFilm;

import org.hibernate.Session;

import dao.DAOActeurFilm;
import dao.DAOProducteurFilm;

public class DAOProducteurFilmHBM extends DAOHBM implements DAOProducteurFilm{

	@Override
	public void save(ProducteurFilm acteurFilm) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(acteurFilm);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from prodcuteur_film").uniqueResult();
		return compteur;
	}
	

	public ArrayList<ProducteurFilm> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<ProducteurFilm>	tabNote = (ArrayList<ProducteurFilm>) session.createQuery("FROM producteur_film").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabNote);

		return tabNote;
	}

	@Override
	public void saveOrUpdate(ProducteurFilm acteur_film) throws Exception {
		// TODO Auto-generated method stub
		
	}

}