package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Chauffage")
public class InstalChauffage extends Installation {

	@Column(name = "Puissance")
	private int puissance;

	@OneToOne(cascade = CascadeType.ALL)
	ConsommationChauffage consoChauffage;

	public InstalChauffage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstalChauffage(int id, String nomInstal, String dateAjout, Boolean etat, Piece piece,
			List<Programme> programmes) {
		super(id, nomInstal, dateAjout, etat, piece, programmes);
		// TODO Auto-generated constructor stub
	}

	public InstalChauffage(int puissance, ConsommationChauffage consoChauffage) {
		super();
		this.puissance = puissance;
		this.consoChauffage = consoChauffage;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public ConsommationChauffage getConsoChauffage() {
		return consoChauffage;
	}

	public void setConsoChauffage(ConsommationChauffage consoChauffage) {
		this.consoChauffage = consoChauffage;
	}

}
