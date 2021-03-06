package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Acteur;
import metier.Personne;
import metier.Recompense;
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
		ArrayList<Personne>	tabCodePers = (ArrayList<Personne>) session.createQuery("FROM Personne WHERE nom_pers LIKE :search OR prenom_pers LIKE :search").setParameter("search", "%"+string+"%").list();
		close(session);

		return tabCodePers;
	}

	@Override
	public void saveOrUpdate(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Personne personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.update(personne);
		close(session);
	}

}
