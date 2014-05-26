package dao.hbm;

import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;
import metier.RealisateurFilm;

import org.hibernate.Session;

import dao.DAOActeurFilm;
import dao.DAORealisateurFilm;

public class DAORealisateurFilmHBM extends DAOHBM implements DAORealisateurFilm{

	/* (non-Javadoc)
	 * @see dao.hbm.DAORealisateur#save(metier.RealisateurFilm)
	 */
	@Override
	public void save(RealisateurFilm realFilm) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(realFilm);
		close(session);
	}

	/* (non-Javadoc)
	 * @see dao.hbm.DAORealisateur#size()
	 */
	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from realisateur_film").uniqueResult();
		return compteur;
	}
	

	/* (non-Javadoc)
	 * @see dao.hbm.DAORealisateur#load(java.lang.String)
	 */
	@Override
	public ArrayList<RealisateurFilm> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<RealisateurFilm>	tabNote = (ArrayList<RealisateurFilm>) session.createQuery("FROM realisateur_film").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabNote);

		return tabNote;
	}

	/* (non-Javadoc)
	 * @see dao.hbm.DAORealisateur#saveOrUpdate(metier.RealisateurFilm)
	 */
	@Override
	public void saveOrUpdate(RealisateurFilm real_film) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
