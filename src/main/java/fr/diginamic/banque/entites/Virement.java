package fr.diginamic.banque.entites;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Virement extends Operation {

	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	public Virement() {
		super();
	}

	public Virement(String beneficiaire, LocalDateTime date, double montant, String motif, Compte compte) {
		super(date, montant, motif, compte);
		this.beneficiaire = beneficiaire;
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	@Override
	public String toString() {
		return super.toString() + " Virement [beneficiaire=" + beneficiaire + "]";
	}

}
