package metier;

import java.util.HashSet;
import java.util.Set;

public class Acteur extends Personne
{
	private Set<Film> films = new HashSet<Film>();
	public Acteur(String nom, String prenom, String datenaiss) 
	{
		super(nom, prenom, datenaiss);
	}

	public Acteur()
	{
		;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}
}
