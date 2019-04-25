package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Luminosite")
public class CapteurLumen extends Capteur {
	@Column(name="Luminosite")
	private int luminosite;

	public CapteurLumen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CapteurLumen(int idCapteur, String type, Piece piece) {
		super(idCapteur, type, piece);
		// TODO Auto-generated constructor stub
	}

	public CapteurLumen(int luminosite) {
		super();
		this.luminosite = luminosite;
	}

	public int getLuminosite() {
		return luminosite;
	}

	public void setLuminosite(int luminosite) {
		this.luminosite = luminosite;
	}

}
