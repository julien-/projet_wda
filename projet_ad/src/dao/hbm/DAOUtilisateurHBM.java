package dao.hbm;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;

import dao.DAOUtilisateur;
import metier.Utilisateur;

public class DAOUtilisateurHBM extends DAOHBM implements DAOUtilisateur {

	@Override
	public Utilisateur get(int int_utilisateur) throws Exception {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = null;
		Session session = connect();
		
		utilisateur = (Utilisateur)session.get(Utilisateur.class, int_utilisateur);
		
		close(session);
		return utilisateur;
	}

	@Override
	public void save(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(utilisateur);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from utilisateur").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Utilisateur> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Utilisateur>	tabIdUser = (ArrayList<Utilisateur>) session.createQuery("FROM Utilisateur").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabIdUser);

		return tabIdUser;
	}

	@Override
	public void saveOrUpdate(Utilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
