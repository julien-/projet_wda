package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Session;

import metier.Acteur;
import metier.Personne;
import metier.Producteur;
import metier.Recompense;
import metier.toProducteur;
import dao.DAOPersonne;
import dao.DAOProducteur;

public class DAOProducteurHBM extends DAOHBM implements DAOProducteur {

	/* (non-Javadoc)
	 * @see dao.hbm.DAOProducteur#get(int)
	 */
	@Override
	public toProducteur get(int code_pers) throws Exception {
		// TODO Auto-generated method stub
		toProducteur pers = null;
		Session session = connect();
		
		pers = (toProducteur)session.get(toProducteur.class, code_pers);
		
		close(session);
		return pers;
		
	}
	
	/* (non-Javadoc)
	 * @see dao.hbm.DAOProducteur#save(metier.Producteur)
	 */

	@Override
	public void save(toProducteur personne) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(personne);
		close(session);
	}

	/* (non-Javadoc)
	 * @see dao.hbm.DAOProducteur#size()
	 */

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from Producteur").uniqueResult();
		return compteur;
	}
	

	/* (non-Javadoc)
	 * @see dao.hbm.DAOProducteur#load(java.lang.String)
	 */
	@Override
	public ArrayList<toProducteur> load(String string) throws Exception {
		Session	session = connect();
		
		@SuppressWarnings("unchecked")
		ArrayList<toProducteur>	tabCodePers = (ArrayList<toProducteur>) session.createQuery("FROM Producteur").list();
		close(session);

		return tabCodePers;
	}

	/* (non-Javadoc)
	 * @see dao.hbm.DAOProducteur#saveOrUpdate(metier.Producteur)
	 */

	@Override
	public void saveOrUpdate(toProducteur personne) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
