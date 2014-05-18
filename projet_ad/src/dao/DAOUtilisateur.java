package dao;
import java.util.ArrayList;
import java.util.Collection;

import metier.Film;
import metier.Utilisateur;

public interface DAOUtilisateur 
{
	Utilisateur get(int id_utilisateur) throws Exception;
	void save(Utilisateur utilisateur) throws Exception;
	long size() throws Exception;
	ArrayList<Utilisateur> load(String nom) throws Exception;
	void saveOrUpdate(Utilisateur utilisateur) throws Exception;
}
