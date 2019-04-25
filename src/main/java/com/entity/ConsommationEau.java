package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Eau")
public class ConsommationEau extends Consommation {

	@Column(name="m3_par_jour")
	private double ConsM3Jour;
	@Column(name="m3_par_mois")
	private double ConsM3Mois;
	@Column(name="m3_par_an")
	private double ConsM3An;

	public ConsommationEau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsommationEau(double consM3Jour, double consM3Mois, double consM3An) {
		super();
		ConsM3Jour = consM3Jour;
		ConsM3Mois = consM3Mois;
		ConsM3An = consM3An;
	}

	public double getConsM3Jour() {
		return ConsM3Jour;
	}

	public void setConsM3Jour(double consM3Jour) {
		ConsM3Jour = consM3Jour;
	}

	public double getConsM3Mois() {
		return ConsM3Mois;
	}

	public void setConsM3Mois(double consM3Mois) {
		ConsM3Mois = consM3Mois;
	}

	public double getConsM3An() {
		return ConsM3An;
	}

	public void setConsM3An(double consM3An) {
		ConsM3An = consM3An;
	}

	@Override
	public String toString() {
		return "ConsommationEau [ConsM3Jour=" + ConsM3Jour + ", ConsM3Mois=" + ConsM3Mois + ", ConsM3An=" + ConsM3An
				+ "]";
	}

}
