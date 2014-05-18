package dao.hbm;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;

import metier.Note;
import dao.DAONote;


public class DAONoteHBM extends DAOHBM implements DAONote {


	@Override
	public void save(Note note) throws Exception {
		// TODO Auto-generated method stub
		Session session = connect();
		
		session.save(note);
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
		ArrayList<Note>	tabNote = (ArrayList<Note>) session.createQuery("FROM note_film").list();
		close(session);

		System.out.println("Coucou");
		System.out.println(tabNote);

		return tabNote;
	}

	@Override
	public void saveOrUpdate(Note note) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
