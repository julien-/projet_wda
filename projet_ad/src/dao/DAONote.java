package dao;
import java.util.ArrayList;

import metier.Note;

public interface DAONote 
{
	void save(Note note) throws Exception;
	long size() throws Exception;
	ArrayList<Note> load(String nom) throws Exception;
	ArrayList<Note> load(int id) throws Exception;
	void saveOrUpdate(Note note) throws Exception;
	void update(Note note) throws Exception; 
}
