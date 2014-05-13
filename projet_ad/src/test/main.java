package test;

import metier.Personne;
import dao.DAOPersonne;
import dao.hbm.DAOPersonneHBM;

public class main {

	public static void main(String[] args)
	{
		DAOPersonne daoPersonne = new DAOPersonneHBM();
		
		try {
			daoPersonne.save(new Personne("nicolas", "galmiche", "1991-06-07"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
