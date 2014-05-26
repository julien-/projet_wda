package dao;
import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;

public interface DAOActeurFilm 
{
	void save(ActeurFilm note) throws Exception;
	long size() throws Exception;
	ArrayList<ActeurFilm> load(String nom) throws Exception;
	void saveOrUpdate(ActeurFilm note) throws Exception;
}
