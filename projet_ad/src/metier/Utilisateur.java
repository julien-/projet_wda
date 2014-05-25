package metier;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Set;

public class Utilisateur implements Serializable, Remote, IUtilisateur {

	int _id;
	String _pseudo;
	String _mdp;
	int verifie = 0;
	
	public int getVerifie() {
		return verifie;
	}


	public void setVerifie(int verifie) {
		this.verifie = verifie;
	}

	private Set<Note> _notes = new HashSet<Note>();
	public Utilisateur() {

	}

	
	public Utilisateur(String _pseudo, String _mdp) {
		this._pseudo = _pseudo;
		this._mdp = _mdp;
	}
	
	
	/* (non-Javadoc)
	 * @see metier.IUtilisateur#get_notes()
	 */
	@Override
	public Set<Note> get_notes() {
		return _notes;
	}


	/* (non-Javadoc)
	 * @see metier.IUtilisateur#set_notes(java.util.Set)
	 */
	@Override
	public void set_notes(Set<Note> _notes) {
		this._notes = _notes;
	}


	/* (non-Javadoc)
	 * @see metier.IUtilisateur#get_id()
	 */
	@Override
	public int get_id() {
		return _id;
	}


	/* (non-Javadoc)
	 * @see metier.IUtilisateur#set_id(int)
	 */
	@Override
	public void set_id(int _id) {
		this._id = _id;
	}


	/* (non-Javadoc)
	 * @see metier.IUtilisateur#get_pseudo()
	 */
	@Override
	public String get_pseudo() {
		return _pseudo;
	}

	/* (non-Javadoc)
	 * @see metier.IUtilisateur#set_pseudo(java.lang.String)
	 */
	@Override
	public void set_pseudo(String _pseudo) {
		this._pseudo = _pseudo;
	}

	/* (non-Javadoc)
	 * @see metier.IUtilisateur#get_mdp()
	 */
	@Override
	public String get_mdp() {
		return _mdp;
	}

	/* (non-Javadoc)
	 * @see metier.IUtilisateur#set_mdp(java.lang.String)
	 */
	@Override
	public void set_mdp(String _mdp) {
		this._mdp = _mdp;
	}




}
