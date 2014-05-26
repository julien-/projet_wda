package metier;

import java.util.HashSet;
import java.util.Set;

public class Realisateur extends Personne {

	private Set<RealisateurFilm> films = new HashSet<RealisateurFilm>();


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

	public Set<RealisateurFilm> getFilms() {
		return films;
	}

	public void setFilms(Set<RealisateurFilm> films) {
		this.films = films;
	}
}
