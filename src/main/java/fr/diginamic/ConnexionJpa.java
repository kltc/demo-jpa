package fr.diginamic;

import fr.diginamic.entites.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Livre livre = em.find(Livre.class, 2);

		if (null != livre) {
			System.out.println(livre);
		}

		em.close();
		emf.close();

	}

}
