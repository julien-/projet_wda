package dao;

import java.util.ArrayList;

import metier.Personne;
import metier.Producteur;
import metier.toProducteur;

public interface DAOProducteur {

	public abstract toProducteur get(int code_pers) throws Exception;

	public abstract void save(toProducteur personne) throws Exception;

	public abstract long size() throws Exception;

	public abstract ArrayList<toProducteur> load(String string) throws Exception;

	public abstract void saveOrUpdate(toProducteur personne) throws Exception;

}