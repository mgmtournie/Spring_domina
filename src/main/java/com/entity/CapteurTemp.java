package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Temperature")
public class CapteurTemp extends Capteur {

	@Column(name="Temperature")
	private int temp;

	public CapteurTemp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CapteurTemp(int idCapteur, String type, Piece piece) {
		super(idCapteur, type, piece);
		// TODO Auto-generated constructor stub
	}

	public CapteurTemp(int temp) {
		super();
		this.temp = temp;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

}
