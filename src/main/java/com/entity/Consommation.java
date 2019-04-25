package com.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CONSO", discriminatorType=DiscriminatorType.STRING)
@Entity
@Table(name = "consommations")
public class Consommation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONSO")
	private int idConsommateur;
	
	@Column
	private String fournisseur;

	public Consommation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consommation(int idConsommateur, String fournisseur) {
		super();
		this.idConsommateur = idConsommateur;
		this.fournisseur = fournisseur;
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
}
