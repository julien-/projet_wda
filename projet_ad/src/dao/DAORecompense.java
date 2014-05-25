package dao;
import java.util.ArrayList;

import metier.Recompense;

public interface DAORecompense 
{
	Recompense get(int code_pers) throws Exception;
	void save(Recompense rec) throws Exception;
	long size() throws Exception;
	ArrayList<Recompense> loadrecfilm(int code) throws Exception;
	ArrayList<Recompense> loadrecpersonne(int code) throws Exception;
	void saveOrUpdate(Recompense personne) throws Exception;
}
