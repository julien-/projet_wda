package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Recompense;
import dao.DAORecompense;

public class DAORecompenseHBM extends DAOHBM implements DAORecompense {

	@Override
	public Recompense get(int code_pers) throws Exception {
		// TODO Auto-generated method stub
		Recompense pers = null;
		Session session = connect();
		
		pers = (Recompense)session.get(Recompense.class, code_pers);
		
		close(session);
		return pers;
		
	}
	
	@Override
	public void save(Recompense Recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(Recompense);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from Recompense").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Recompense> load(int code) throws Exception {
		Session	session = connect();		
		
		@SuppressWarnings("unchecked")
		ArrayList<Recompense>	tabCodeRec = (ArrayList<Recompense>) session.createQuery("FROM Recompense WHERE id_film_recfilm LIKE :search").setParameter("search", "%"+code+"%").list();
		close(session);

		return tabCodeRec;
	}


	@Override
	public void saveOrUpdate(Recompense Recompense) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
