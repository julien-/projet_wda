package metier;

import java.util.HashSet;
import java.util.Set;

public class Realisateur extends Personne {

	private Set<Film> films = new HashSet<Film>();


	public Realisateur(String nom, String prenom, String datenaiss) {
		super(nom, prenom, datenaiss);
		// TODO Auto-generated constructor stub
	}

	public Realisateur(String nom, String prenom, String datenaiss, String photo) {
		super(nom, prenom, datenaiss, photo);
		// TODO Auto-generated constructor stub
	}

	public Realisateur() {
		// TODO Auto-generated constructor stub
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}
}
