package dao;
import java.util.ArrayList;
import java.util.Collection;

import metier.Film;

public interface DAOFilm 
{
	Film get(int id_film) throws Exception;
	void save(Film film) throws Exception;
	long size() throws Exception;
	ArrayList<Film> load(String nom) throws Exception;
	void saveOrUpdate(Film film) throws Exception;
}
