package dao;
import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;
import metier.ProducteurFilm;

public interface DAOActeurFilm 
{
	void save(ActeurFilm note) throws Exception;
	long size() throws Exception;
	ArrayList<ActeurFilm> loadAll() throws Exception;
	void saveOrUpdate(ActeurFilm note) throws Exception;
	void update(ActeurFilm acteurfilm) throws Exception;
}
