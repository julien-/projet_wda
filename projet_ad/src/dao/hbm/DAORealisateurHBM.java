package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Acteur;
import metier.Personne;
import metier.Producteur;
import metier.Recompense;
import metier.toActeur;
import metier.toProducteur;
import metier.toRealisateur;
import dao.DAOActeur;
import dao.DAOProducteur;
import dao.DAORealisateur;

public class DAORealisateurHBM extends DAOHBM implements DAORealisateur {

	@Override
	public void save(toRealisateur personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(personne);
		close(session);
	}
}
