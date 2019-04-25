package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Volet")
public class InstalVolet extends Installation {

	@Column(name = "ouverture")
	private int ouverture;

	public InstalVolet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstalVolet(int id, String type, String dateAjout, Boolean etat, Piece piece, List<Programme> programmes,
			Consommation conso) {
		super(id, type, dateAjout, etat, piece, programmes, conso);
		// TODO Auto-generated constructor stub
	}

	public InstalVolet(int ouverture) {
		super();
		this.ouverture = ouverture;
	}

	public int getOuverture() {
		return ouverture;
	}

	public void setOuverture(int ouverture) {
		this.ouverture = ouverture;
	}

}
