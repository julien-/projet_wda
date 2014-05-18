package metier;

import java.util.HashSet;
import java.util.Set;

public class Utilisateur {

	int _id;
	String _pseudo;
	String _mdp;
	int _pro;
	private Set<Note> _notes = new HashSet<Note>();
	public Utilisateur() {

	}

	
	public Utilisateur(String _pseudo, String _mdp, int _pro) {
		this._pseudo = _pseudo;
		this._mdp = _mdp;
		this._pro = _pro;
	}
	
	
	public Set<Note> get_notes() {
		return _notes;
	}


	public void set_notes(Set<Note> _notes) {
		this._notes = _notes;
	}


	public int get_id() {
		return _id;
	}


	public void set_id(int _id) {
		this._id = _id;
	}


	public String get_pseudo() {
		return _pseudo;
	}

	public void set_pseudo(String _pseudo) {
		this._pseudo = _pseudo;
	}

	public String get_mdp() {
		return _mdp;
	}

	public void set_mdp(String _mdp) {
		this._mdp = _mdp;
	}

	public int get_pro() {
		return _pro;
	}

	public void set_pro(int _pro) {
		this._pro = _pro;
	}



}
