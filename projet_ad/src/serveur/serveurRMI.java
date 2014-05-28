package serveur;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;

import dao.DAOUtilisateur;
import dao.hbm.DAOUtilisateurHBM;
import metier.IUtilisateur;
import metier.Utilisateur;

public class serveurRMI 
{
	public static void main(String[] args) 
	{
		while(true) // serveur toujours en �coute
		{
			boolean trouve = false;
			try
			{
				DAOUtilisateur dao = new DAOUtilisateurHBM();
				try // cr�ation du registre rmi
				{
					java.rmi.registry.LocateRegistry.createRegistry(1099);
					System.out.println("Serveur RMI d�marr� et registre cr��");
				}
				catch (Exception e)
				{
					System.out.println("Le registre existe d�j�");
				}
				System.out.println("Attente d'une requ�te d'authentification...");
				// boucle de recherche du nom sur le reseau
				while (!trouve)
				{
					try
					{
						IUtilisateur utilisateur = (IUtilisateur) Naming.lookup("rmi://localhost:1099/UTILISATEUR");
						trouve = true;
						System.out.println("Login re�u: " + utilisateur.get_pseudo());
						System.out.println("Mot de passe re�u: " + utilisateur.get_mdp());
						if (dao.get(utilisateur.get_pseudo(), utilisateur.get_mdp()) != -1)
						{
							utilisateur.set_id(dao.get(utilisateur.get_pseudo(), utilisateur.get_mdp()));
							utilisateur.setVerifie(1);
							System.out.println("Authentification r�ussie");
						}
						else
							System.out.println("Authentification �chou�e");
						System.out.println("Noms RMI avant unbind: " + Naming.list("rmi://localhost:1099/UTILISATEUR")[0]);
						Naming.unbind("//localhost:1099/UTILISATEUR");
						System.out.println("Unbind done");
						Naming.rebind("rmi://localhost:1099/REPONSE", utilisateur);
						
					}
					catch(NotBoundException e)
					{

					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}	
			}
			catch (Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}
}
