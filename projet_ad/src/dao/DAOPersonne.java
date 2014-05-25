package dao;
import java.util.ArrayList;

import metier.Personne;

public interface DAOPersonne 
{
	Personne get(int code_pers) throws Exception;
	void save(Personne personne) throws Exception;
	long size() throws Exception;
	ArrayList<Personne> load(String nom) throws Exception;
	ArrayList<Personne> load(int code, String type) throws Exception;
	void saveOrUpdate(Personne personne) throws Exception;
}
