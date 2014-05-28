package dao;

import java.util.ArrayList;

import metier.IUtilisateur;
import metier.Utilisateur;

public interface DAOUtilisateur 
{
	Utilisateur get(int id_utilisateur) throws Exception;
	int get(String login, String pass) throws Exception;
	void save(IUtilisateur utilisateur) throws Exception;
	long size() throws Exception;
	ArrayList<Utilisateur> load(String nom) throws Exception;
	void saveOrUpdate(IUtilisateur utilisateur) throws Exception;
	boolean get(String login) throws Exception;
}
