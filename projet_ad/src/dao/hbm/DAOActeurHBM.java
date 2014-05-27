package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Acteur;
import metier.Film;
import metier.Personne;
import metier.Producteur;
import metier.Recompense;
import metier.toActeur;
import metier.toProducteur;
import dao.DAOActeur;
import dao.DAOProducteur;

public class DAOActeurHBM extends DAOHBM implements DAOActeur {

	@Override
	public void save(toActeur personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(personne);
		close(session);
	}
	
}
