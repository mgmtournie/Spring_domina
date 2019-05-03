package com.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Electricite")
public class ConsommationElec extends Consommation {

	@Column(name = "KWH_par_jour")
	private double ConsKWhJour;
	@Column(name = "KWH_par_mois")
	private double ConsKWhMois;
	@Column(name = "KWH_par_an")
	private double ConsKWhAn;

	public ConsommationElec() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsommationElec(int idConsommateur, String fournisseur, String type, Installation instal,
			Piece piece, double consKWhJour, double consKWhMois, double consKWhAn) {
		super(idConsommateur, fournisseur, type, instal, piece);
		ConsKWhJour = consKWhJour;
		ConsKWhMois = consKWhMois;
		ConsKWhAn = consKWhAn;
	}

	public ConsommationElec(double consKWhJour, double consKWhMois, double consKWhAn) {
		super();
		ConsKWhJour = consKWhJour;
		ConsKWhMois = consKWhMois;
		ConsKWhAn = consKWhAn;
	}

	public double getConsKWhJour() {
		return ConsKWhJour;
	}

	public void setConsKWhJour(double consKWhJour) {
		ConsKWhJour = consKWhJour;
	}

	public double getConsKWhMois() {
		return ConsKWhMois;
	}

	public void setConsKWhMois(double consKWhMois) {
		ConsKWhMois = consKWhMois;
	}

	public double getConsKWhAn() {
		return ConsKWhAn;
	}

	public void setConsKWhAn(double consKWhAn) {
		ConsKWhAn = consKWhAn;
	}

	@Override
	public String toString() {
		return "ConsommationElec [ConsKWhJour=" + ConsKWhJour + ", ConsKWhMois=" + ConsKWhMois + ", ConsKWhAn="
				+ ConsKWhAn + "]";
	}

}
