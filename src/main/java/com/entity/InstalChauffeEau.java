package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Chauffe-eau")
public class InstalChauffeEau extends Installation {

	@Column(name = "Puissance")
	private int puissance;

	@OneToOne(cascade = CascadeType.ALL)
	ConsommationElec consoElec;

	@OneToOne(cascade = CascadeType.ALL)
	ConsommationEau consoEau;

	public InstalChauffeEau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstalChauffeEau(int id, String nomInstal, String dateAjout, Boolean etat, Piece piece,
			List<Programme> programmes) {
		super(id, nomInstal, dateAjout, etat, piece, programmes);
		// TODO Auto-generated constructor stub
	}

	public InstalChauffeEau(int puissance, ConsommationElec consoElec, ConsommationEau consoEau) {
		super();
		this.puissance = puissance;
		this.consoElec = consoElec;
		this.consoEau = consoEau;
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

	public ConsommationEau getConsoEau() {
		return consoEau;
	}

	public void setConsoEau(ConsommationEau consoEau) {
		this.consoEau = consoEau;
	}

}
