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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
@Entity
@Table(name = "installations")
public class Installation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_INSTAL")
	private int id;

	@Column(name = "TYPE", insertable = false, updatable = false)
	private String nomInstal;

	@Column(name = "Date_ajout")
	private String DateAjout;

	@Column(name = "ETAT")
	private Boolean etat;

	@ManyToOne
	@JoinColumn(name = "ID_ROOM")
	private Piece piece;

	@ManyToMany(mappedBy = "installations")
	private List<Programme> programmes = new ArrayList<Programme>();

	public Installation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Installation(int id, String nomInstal, String dateAjout, Boolean etat, Piece piece,
			List<Programme> programmes) {
		super();
		this.id = id;
		this.nomInstal = nomInstal;
		DateAjout = dateAjout;
		this.etat = etat;
		this.piece = piece;
		this.programmes = programmes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomInstal() {
		return nomInstal;
	}

	public void setNomInstal(String nomInstal) {
		this.nomInstal = nomInstal;
	}

	public String getDateAjout() {
		return DateAjout;
	}

	public void setDateAjout(String dateAjout) {
		DateAjout = dateAjout;
	}

	public Boolean getEtat() {
		return etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public List<Programme> getProgrammes() {
		return programmes;
	}

	public void setProgrammes(List<Programme> programmes) {
		this.programmes = programmes;
	}

}
