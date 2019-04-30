package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Eclairage")
public class InstalEclairage extends Installation {

	@Column(name = "intensite")
	private int intensite;

	@OneToOne(cascade = CascadeType.ALL)
	ConsommationElec consoElec;

	public InstalEclairage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstalEclairage(int id, String type, String dateAjout, Boolean etat, Piece piece, List<Programme> programmes,
			Consommation conso, int intensite, ConsommationElec consoElec) {
		super(id, type, dateAjout, etat, piece, programmes, conso);
		this.intensite = intensite;
		this.consoElec = consoElec;
	}

	public InstalEclairage(int intensite, ConsommationElec consoElec) {
		super();
		this.intensite = intensite;
		this.consoElec = consoElec;
	}

	public int getIntensite() {
		return intensite;
	}

	public void setIntensite(int intensite) {
		this.intensite = intensite;
	}

	public ConsommationElec getConsoElec() {
		return consoElec;
	}

	public void setConsoElec(ConsommationElec consoElec) {
		this.consoElec = consoElec;
	}

}
