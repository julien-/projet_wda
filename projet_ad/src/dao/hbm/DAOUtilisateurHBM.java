package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import dao.DAOUtilisateur;
import metier.IUtilisateur;
import metier.Utilisateur;

public class DAOUtilisateurHBM extends DAOHBM implements DAOUtilisateur {

	@Override
	public IUtilisateur get(int int_utilisateur) throws Exception {
		// TODO Auto-generated method stub
		IUtilisateur utilisateur = null;
		Session session = connect();
		
		utilisateur = (IUtilisateur)session.get(Utilisateur.class, int_utilisateur);
		
		close(session);
		return utilisateur;
	}
	
	public boolean get(String login, String pass) throws Exception {
		Session	session = connect();
		
		@SuppressWarnings("unchecked")
		ArrayList<Utilisateur>	tabIdUser = (ArrayList<Utilisateur>) session.createQuery("FROM Utilisateur WHERE login_util ='" + login + "' AND pass_util='" + pass + "'").list();
		close(session);
		
		return (tabIdUser.size() > 0);
	}

	@Override
	public void save(IUtilisateur utilisateur) throws Exception {
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
	public void saveOrUpdate(IUtilisateur utilisateur) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
