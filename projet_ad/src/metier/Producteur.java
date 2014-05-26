package metier;

import java.util.HashSet;
import java.util.Set;

public class Producteur extends Personne{

	private Set<ProducteurFilm> films = new HashSet<ProducteurFilm>();
	public Producteur() {
		// TODO Auto-generated constructor stub
	}
	public Set<ProducteurFilm> getFilms() {
		return films;
	}
	public void setFilms(Set<ProducteurFilm> films) {
		this.films = films;
	}
	public Producteur(String nom, String prenom, String datenaiss, String photo) {
		super(nom, prenom, datenaiss, photo);
		// TODO Auto-generated constructor stub
	}
	public Producteur(String nom, String prenom, String datenaiss) {
		super(nom, prenom, datenaiss);
		// TODO Auto-generated constructor stub
	}

	
}
