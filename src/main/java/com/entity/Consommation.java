package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_CONSO", discriminatorType = DiscriminatorType.STRING)
@Entity
@Table(name = "consommations")
public class Consommation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONSO")
	private int idConsommateur;

	@Column
	private String fournisseur;

	@Column(insertable = false, updatable = false)
	private String type;

	@OneToOne
	Installation instal;

	@OneToMany
	private List<Piece> pieces = new ArrayList<Piece>();

	public Consommation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consommation(int idConsommateur, String fournisseur, String type, Installation instal, List<Piece> pieces) {
		super();
		this.idConsommateur = idConsommateur;
		this.fournisseur = fournisseur;
		this.type = type;
		this.instal = instal;
		this.pieces = pieces;
	}

	public int getIdConsommateur() {
		return idConsommateur;
	}

	public void setIdConsommateur(int idConsommateur) {
		this.idConsommateur = idConsommateur;
	}

	public String getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(String fournisseur) {
		this.fournisseur = fournisseur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Installation getInstal() {
		return instal;
	}

	public void setInstal(Installation instal) {
		this.instal = instal;
	}

	public List<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

}
