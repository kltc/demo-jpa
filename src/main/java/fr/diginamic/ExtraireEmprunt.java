package fr.diginamic;

import fr.diginamic.entites.Client;
import fr.diginamic.entites.Emprunt;
import fr.diginamic.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ExtraireEmprunt {

	public static void main(String[] args) {

		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
				EntityManager em = emf.createEntityManager();) {

			em.getTransaction().begin();

//			// Création d'un nouveau livre
//
//			Livre livreACreer = new Livre("Les fleurs du mal", "Charles Baudelaire");
//
//			em.persist(livreACreer);
//
//			// Récupération
//
//			Livre livre2 = em.find(Livre.class, 2);
//
//			if (null != livre2) {
//				System.out.println(livre2);
//			}

//			// Récupération des emprunts du client id 1
//			Client client = em.find(Client.class, 1);
//
//			if (null != client) {
//				System.out.println(client.getEmprunts());
//			}

			// Récupération des livres de l'emprunt id 2

			Emprunt emprunt = em.find(Emprunt.class, 2);

			if (null != emprunt) {
				System.out.println(emprunt.getLivres());
			}

//			em.close();
//			emf.close();

			em.getTransaction().commit();
		}

	}

}
