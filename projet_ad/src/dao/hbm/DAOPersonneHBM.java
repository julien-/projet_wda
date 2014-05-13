package dao.hbm;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;

import metier.Personne;
import dao.DAOPersonne;

public class DAOPersonneHBM extends DAOHBM implements DAOPersonne {

	@Override
	public Personne get(int code_pers) throws Exception {
		// TODO Auto-generated method stub
		Personne pers = null;
		Session session = connect();
		
		pers = (Personne)session.get(Personne.class, code_pers);
		
		close(session);
		return pers;
		
	}

	@Override
	public void save(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(personne);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from personne").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Personne> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Personne>	tabCodePers = (ArrayList<Personne>) session.createQuery("FROM Personne").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabCodePers);

		return tabCodePers;
	}


	@Override
	public void saveOrUpdate(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
