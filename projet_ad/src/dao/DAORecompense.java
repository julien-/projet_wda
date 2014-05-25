package dao;
import java.util.ArrayList;

import metier.Recompense;

public interface DAORecompense 
{
	Recompense get(int code_pers) throws Exception;
	void save(Recompense personne) throws Exception;
	long size() throws Exception;
	ArrayList<Recompense> load(int code) throws Exception;
	void saveOrUpdate(Recompense personne) throws Exception;
}
