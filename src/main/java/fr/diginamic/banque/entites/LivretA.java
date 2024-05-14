package fr.diginamic.banque.entites;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIVRET_A")
public class LivretA extends Compte {

	@Column(name = "TAUX")
	private double taux;

	public LivretA() {
		super();
	}

	public LivretA(double taux, String numero, Double solde, Set<Operation> operations) {
		super(numero, solde, operations);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + " LivretA [taux=" + taux + "]";
	}

}
