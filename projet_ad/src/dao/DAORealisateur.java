package dao;

import metier.toActeur;
import metier.toRealisateur;

public interface DAORealisateur {

	public abstract void save(toRealisateur personne) throws Exception;

}