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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
@Entity
@Table(name = "capteurs")
public class Capteur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CAPTEUR")
	private int idCapteur;
	
	@Column(insertable = false, updatable = false)
	private String type;	
	
	
	@ManyToOne
	@JoinColumn(name = "ROOM")
	private Piece piece;

	public Capteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Capteur(int idCapteur, String type, Piece piece) {
		super();
		this.idCapteur = idCapteur;
		this.type = type;
		this.piece = piece;
	}

	public int getIdCapteur() {
		return idCapteur;
	}

	public void setIdCapteur(int idCapteur) {
		this.idCapteur = idCapteur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	

}
