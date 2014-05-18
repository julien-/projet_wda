package metier;

import java.io.Serializable;

public class NoteID implements Serializable{

	private int _filmID;
	private int _utilisateuIDr;
	
	public NoteID() {
		// TODO Auto-generated constructor stub
	}

	public int get_filmID() {
		return _filmID;
	}

	public void set_filmID(int _filmID) {
		this._filmID = _filmID;
	}

	public int get_utilisateuIDr() {
		return _utilisateuIDr;
	}

	public void set_utilisateuIDr(int _utilisateuIDr) {
		this._utilisateuIDr = _utilisateuIDr;
	}


	
}
