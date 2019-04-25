package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Piece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROOM")
	private int idPiece;

	@Column(name = "ROOM_NAME")
	private String nomPiece;

	@Column(name = "SUPERFICIE")
	private int superficieM2;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Programme> programmes = new ArrayList<Programme>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Installation> installations = new ArrayList<Installation>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Capteur> capteurs = new ArrayList<Capteur>();

	@ManyToOne
	Consommation conso;

	public Piece() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Piece(int idPiece, String nomPiece, int superficieM2, List<Programme> programmes,
			List<Installation> installations, List<Capteur> capteurs, Consommation conso) {
		super();
		this.idPiece = idPiece;
		this.nomPiece = nomPiece;
		this.superficieM2 = superficieM2;
		this.programmes = programmes;
		this.installations = installations;
		this.capteurs = capteurs;
		this.conso = conso;
	}

	public int getIdPiece() {
		return idPiece;
	}

	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
	}

	public String getNomPiece() {
		return nomPiece;
	}

	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}

	public int getSuperficieM2() {
		return superficieM2;
	}

	public void setSuperficieM2(int superficieM2) {
		this.superficieM2 = superficieM2;
	}

	public List<Programme> getProgrammes() {
		return programmes;
	}

	public void setProgrammes(List<Programme> programmes) {
		this.programmes = programmes;
	}

	public List<Installation> getInstallations() {
		return installations;
	}

	public void setInstallations(List<Installation> installations) {
		this.installations = installations;
	}

	public List<Capteur> getCapteurs() {
		return capteurs;
	}

	public void setCapteurs(List<Capteur> capteurs) {
		this.capteurs = capteurs;
	}

	public Consommation getConso() {
		return conso;
	}

	public void setConso(Consommation conso) {
		this.conso = conso;
	}

}
