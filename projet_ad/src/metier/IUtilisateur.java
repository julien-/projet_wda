package metier;

import java.rmi.Remote;
import java.util.Set;

public interface IUtilisateur extends Remote{

	public abstract Set<Note> get_notes();

	public abstract void set_notes(Set<Note> _notes);

	public abstract int get_id();

	public abstract void set_id(int _id);

	public abstract String get_pseudo();

	public abstract void set_pseudo(String _pseudo);

	public abstract String get_mdp();

	public abstract void set_mdp(String _mdp);
	
	public abstract int getVerifie();

	public abstract void setVerifie(int verifie);

}