package fr.diginamic.banque.entites;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANQUE")

public class Banque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NOM", length = 50, nullable = false, unique = true)
	private String nom;

	@OneToMany(mappedBy = "banque", cascade = CascadeType.PERSIST)
	private Set<Client> clients;

	{
		clients = new HashSet<>();
	}

	public Banque(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public void addClient(Client client) {
		client.setBanque(this);
	}

	@Override
	public String toString() {
		return "Banque [nom=" + nom + "]";
	}

}
