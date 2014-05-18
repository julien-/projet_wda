package dao;
import java.util.ArrayList;
import java.util.Collection;

import metier.Note;

public interface DAONote 
{
	void save(Note note) throws Exception;
	long size() throws Exception;
	ArrayList<Note> load(String nom) throws Exception;
	void saveOrUpdate(Note note) throws Exception;
}
