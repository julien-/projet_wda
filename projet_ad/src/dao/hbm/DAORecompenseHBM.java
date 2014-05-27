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
	public void save(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(recompense);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from Recompense").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Recompense> loadrecfilm(int code) throws Exception {
		Session	session = connect();		
		ArrayList<Recompense> tabCodeRec = null;
		
		tabCodeRec = (ArrayList<Recompense>) session.createQuery("FROM Recompense WHERE id_film_recfilm LIKE :search").setParameter("search", "%"+code+"%").list();
		close(session);

		return tabCodeRec;
	}
	
	public ArrayList<Recompense> loadrecpersonne(int code) throws Exception {
		Session	session = connect();		
		
		@SuppressWarnings("unchecked")
		ArrayList<Recompense>	tabCodeRec = (ArrayList<Recompense>) session.createQuery("FROM Recompense WHERE id_personne_recpers LIKE :search").setParameter("search", "%"+code+"%").list();
		close(session);

		return tabCodeRec;
	}


	@Override
	public void saveOrUpdate(Recompense Recompense) throws Exception {

	}


	@Override
	public ArrayList<Recompense> loadAll() throws Exception {
		Session	session = connect();		
		ArrayList<Recompense> tabCodeRec = null;
		
		tabCodeRec = (ArrayList<Recompense>) session.createQuery("FROM Recompense").list();
		close(session);

		return tabCodeRec;
	}

	@Override
	public void update(Recompense recompense) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.update(recompense);
		close(session);
	}


}
