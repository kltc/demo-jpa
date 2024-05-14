package fr.diginamic.banque.entites;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ASSURANCE_VIE")
public class AssuranceVie extends Compte {

	@Column(name = "DATE_FIN")
	private LocalDate dateFin;

	@Column(name = "TAUX")
	private double taux;

	public AssuranceVie() {
		super();
	}

	public AssuranceVie(LocalDate dateFin, double taux, String numero, Double solde, Set<Operation> operations) {
		super(numero, solde, operations);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + " AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}

}
