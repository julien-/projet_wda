package dao.hbm;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;

import metier.Film;
import metier.Note;
import metier.Personne;
import metier.Utilisateur;
import dao.DAONote;


public class DAONoteHBM extends DAOHBM implements DAONote 
{


	@Override
	public void save(Note note) throws Exception 
	{
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(note);
		close(session);
	}
	
	public void update(Note note) throws Exception 
	{
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.update(note);
		close(session);
	}

	@Override
	public long size() throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		long compteur = (long) session.createQuery("select count(*) from note_film").uniqueResult();
		return compteur;
	}
	

	public ArrayList<Note> load(String string) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Note>	tabNote = (ArrayList<Note>) session.createQuery("FROM Note").list();
		close(session);
		
		return tabNote;
	}
	
	public ArrayList<Note> load(int id) throws Exception {
		Session	session = connect();
		
		
		@SuppressWarnings("unchecked")
		ArrayList<Note>	tabNote = (ArrayList<Note>) session.createQuery("FROM Note WHERE id_film_note LIKE :search").setParameter("search", "%"+id+"%").list();
		close(session);
		
		return tabNote;
	}

	@Override
	public void saveOrUpdate(Note note) throws Exception 
	{
		Session	session = connect();
		Query countQuery = session.createSQLQuery("SELECT COUNT(*) FROM notes_film WHERE id_film_note = " + note.get_film().get_id() + " AND id_util_note =" + note.get_utilisateur().get_id());
		int resultats = Integer.parseInt(countQuery.list().get(0).toString());
		
		if (resultats > 0)
		{
			session.update(note);
		}
		else
			session.save(note);
		
		close(session);
	}

}
