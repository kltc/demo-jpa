package fr.diginamic.banque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.diginamic.banque.entites.Banque;
import fr.diginamic.banque.entites.Client;
import fr.diginamic.banque.entites.Compte;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {

	public static void main(String[] args) {

		try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
				EntityManager em = emf.createEntityManager()) {

			Banque banque1 = new Banque("BNP Paribas");

			Client client1 = new Client("LE", "Kevin", LocalDate.parse("1995-02-20"), null, null);
			client1.setBanque(banque1);
			// banque1.addClient(client1); // equivalent

			em.getTransaction().begin();

			em.persist(banque1);

			em.getTransaction().commit();

		}

	}
}
