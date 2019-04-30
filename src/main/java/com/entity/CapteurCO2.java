package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CO2")
public class CapteurCO2 extends Capteur {

	@Column(name="Taux_CO2")
	private int TauxCO2;

	public CapteurCO2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CapteurCO2(int idCapteur, String type, Piece piece, int tauxCO2) {
		super(idCapteur, type, piece);
		this.TauxCO2 = tauxCO2;
	}

	public CapteurCO2(int tauxCO2) {
		super();
		TauxCO2 = tauxCO2;
	}

	public int getTauxCO2() {
		return TauxCO2;
	}

	public void setTauxCO2(int tauxCO2) {
		TauxCO2 = tauxCO2;
	}

}
