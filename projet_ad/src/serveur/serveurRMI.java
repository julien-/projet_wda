package serveur;

import java.rmi.AlreadyBoundException;
import java.rmi.Naming;

import dao.DAOUtilisateur;
import dao.hbm.DAOUtilisateurHBM;
import metier.IUtilisateur;
import metier.Utilisateur;


public class serveurRMI 
{
	public static void main(String[] args) 
	{
		while(true)
		{
		boolean trouve = false;
		try
		{
			DAOUtilisateur dao = new DAOUtilisateurHBM();
			try
			{
				java.rmi.registry.LocateRegistry.createRegistry(1099);
				
			}
			
			catch (Exception e)
			{
				System.out.println("Le registre existe déjà");
			}
			System.out.println(("Serveur RMI démarré."));
			while (!trouve)
			{
				try
				{
					IUtilisateur utilisateur = (IUtilisateur) Naming.lookup("rmi://localhost:1099/UTILISATEUR");
					trouve = true;
					System.out.println(utilisateur.get_pseudo());
					System.out.println(utilisateur.get_mdp());
					if (dao.get(utilisateur.get_pseudo(), utilisateur.get_mdp()) == true)
					{
						utilisateur.setVerifie(1);
					}
					Naming.unbind("rmi://localhost:1099/UTILISATEUR");
					Naming.rebind("rmi://localhost:1099/REPONSE", utilisateur);
					System.out.println(Naming.list("rmi://localhost:1099/"));
				}
				catch(Exception e)
				{
					
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
