package dao;

import java.util.ArrayList;

import metier.RealisateurFilm;

public interface DAORealisateurFilm {

	public abstract void save(RealisateurFilm realFilm) throws Exception;

	public abstract long size() throws Exception;

	public abstract ArrayList<RealisateurFilm> loadAll()
			throws Exception;

	public abstract void saveOrUpdate(RealisateurFilm real_film)
			throws Exception;

}