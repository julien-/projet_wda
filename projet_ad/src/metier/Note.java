package metier;

public class Note {

	NoteID _noteID = new NoteID();
	int _note;
	private Utilisateur _utilisateur;
	private Film _film;
	
	public Utilisateur get_utilisateur() {
		return _utilisateur;
	}

	public void set_utilisateur(Utilisateur _utilisateur) {
		this._utilisateur = _utilisateur;
	}

	public Film get_film() {
		return _film;
	}

	public void set_film(Film _film) {
		this._film = _film;
	}

	public Note() {
		// TODO Auto-generated constructor stub
	}
	
	public Note(int note) {
		_note = note;
	}

	public NoteID get_noteID() {
		return _noteID;
	}

	public void set_noteID(NoteID _noteID) {
		this._noteID = _noteID;
	}

	public int get_note() {
		return _note;
	}

	public void set_note(int _note) {
		this._note = _note;
	}

	
}
