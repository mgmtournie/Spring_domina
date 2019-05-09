package com.entity;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Electricite")
public class ConsommationElec extends Consommation {

	@Column(name = "KWH_par_jour")
	private double consKWhJour;
	@Column(name = "KWH_par_mois")
	private double consKWhMois;
	@Column(name = "KWH_par_an")
	private double consKWhAn;

	public ConsommationElec() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ConsommationElec(int idConsommateur, String fournisseur, String type, Installation instal, Piece piece) {
		super(idConsommateur, fournisseur, type, instal, piece);
		// TODO Auto-generated constructor stub
	}


	public ConsommationElec(double consKWhJour, double consKWhMois, double consKWhAn) {
		super();
		this.consKWhJour = consKWhJour;
		this.consKWhMois = consKWhMois;
		this.consKWhAn = consKWhAn;
	}


	public double getConsKWhJour() {
		return consKWhJour;
	}


	public void setConsKWhJour(double consKWhJour) {
		this.consKWhJour = consKWhJour;
	}


	public double getConsKWhMois() {
		return consKWhMois;
	}


	public void setConsKWhMois(double consKWhMois) {
		this.consKWhMois = consKWhMois;
	}


	public double getConsKWhAn() {
		return consKWhAn;
	}


	public void setConsKWhAn(double consKWhAn) {
		this.consKWhAn = consKWhAn;
	}

	
}