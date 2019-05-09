package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Eau")
public class ConsommationEau extends Consommation {

	@Column(name = "m3_par_jour")
	private double consM3Jour;
	@Column(name = "m3_par_mois")
	private double consM3Mois;
	@Column(name = "m3_par_an")
	private double consM3An;

	public ConsommationEau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsommationEau(int idConsommateur, String fournisseur, String type, Installation instal, Piece piece) {
		super(idConsommateur, fournisseur, type, instal, piece);
		// TODO Auto-generated constructor stub
	}

	public ConsommationEau(double consM3Jour, double consM3Mois, double consM3An) {
		super();
		this.consM3Jour = consM3Jour;
		this.consM3Mois = consM3Mois;
		this.consM3An = consM3An;
	}

	public double getConsM3Jour() {
		return consM3Jour;
	}

	public void setConsM3Jour(double consM3Jour) {
		this.consM3Jour = consM3Jour;
	}

	public double getConsM3Mois() {
		return consM3Mois;
	}

	public void setConsM3Mois(double consM3Mois) {
		this.consM3Mois = consM3Mois;
	}

	public double getConsM3An() {
		return consM3An;
	}

	public void setConsM3An(double consM3An) {
		this.consM3An = consM3An;
	}

	
}
