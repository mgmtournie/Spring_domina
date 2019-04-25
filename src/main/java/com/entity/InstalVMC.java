package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("VMC")
public class InstalVMC extends Installation {

	@Column(name = "Puissance")
	private int puissance;

	@OneToOne(cascade = CascadeType.ALL)
	ConsommationElec consoElec;

	public InstalVMC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstalVMC(int id, String type, String dateAjout, Boolean etat, Piece piece, List<Programme> programmes,
			Consommation conso) {
		super(id, type, dateAjout, etat, piece, programmes, conso);
		// TODO Auto-generated constructor stub
	}

	public InstalVMC(int puissance, ConsommationElec consoElec) {
		super();
		this.puissance = puissance;
		this.consoElec = consoElec;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public ConsommationElec getConsoElec() {
		return consoElec;
	}

	public void setConsoElec(ConsommationElec consoElec) {
		this.consoElec = consoElec;
	}

}
