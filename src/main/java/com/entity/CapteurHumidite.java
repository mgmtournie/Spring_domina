package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Humidite")
public class CapteurHumidite extends Capteur {

	@Column(name="Taux_humidite")
	private int humidite;

	public CapteurHumidite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CapteurHumidite(int idCapteur, String type, Piece piece) {
		super(idCapteur, type, piece);
		// TODO Auto-generated constructor stub
	}

	public CapteurHumidite(int humidite) {
		super();
		this.humidite = humidite;
	}

	public int getHumidite() {
		return humidite;
	}

	public void setHumidite(int humidite) {
		this.humidite = humidite;
	}

}
