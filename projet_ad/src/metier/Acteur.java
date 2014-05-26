package metier;

import java.util.HashSet;
import java.util.Set;

public class Acteur extends Personne
{
	private Set<ActeurFilm> films = new HashSet<ActeurFilm>();
	public Acteur(String nom, String prenom, String datenaiss) 
	{
		super(nom, prenom, datenaiss);
	}

	public Acteur()
	{
		;
	}

	public Set<ActeurFilm> getFilms() {
		return films;
	}

	public void setFilms(Set<ActeurFilm> films) {
		this.films = films;
	}
}
