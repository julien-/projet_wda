package dao;
import java.util.ArrayList;

import metier.ActeurFilm;
import metier.Note;
import metier.ProducteurFilm;

public interface DAOProducteurFilm 
{
	void save(ProducteurFilm note) throws Exception;
	long size() throws Exception;
	ArrayList<ProducteurFilm> loadAll() throws Exception;
	void saveOrUpdate(ProducteurFilm note) throws Exception;
}
