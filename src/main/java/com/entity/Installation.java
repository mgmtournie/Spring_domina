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
	private String type;

	@Column(name = "Date_ajout")
	private String dateAjout;

	@Column(name = "ETAT")
	private boolean etat;

	@ManyToOne
	@JoinColumn(name = "ID_ROOM")
	private Piece piece;

	
	@ManyToMany
	private List<Programme> programmes = new ArrayList<Programme>();

	public Installation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Installation(int id, String type, String dateAjout, boolean etat, Piece piece, List<Programme> programmes,
			Consommation conso) {
		super();
		this.id = id;
		this.type = type;
		this.dateAjout = dateAjout;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
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
