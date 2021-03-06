package com.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "programmes")
public class Programme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PROG")
	private int idProg;

	@Column(name = "PROG_NAME")
	private String nomProg;

	
	@ManyToOne
	@JoinColumn(name = "ID_ROOM")
	private Piece piece;

	@JsonIgnore
	@ManyToMany(mappedBy="programmes")
	List<Installation> installations = new ArrayList<Installation>();

	public Programme() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Programme(int idProg, String nomProg, Piece piece, List<Installation> installations) {
		super();
		this.idProg = idProg;
		this.nomProg = nomProg;
		this.piece = piece;
		this.installations = installations;
	}

	public int getIdProg() {
		return idProg;
	}

	public void setIdProg(int idProg) {
		this.idProg = idProg;
	}

	public String getNomProg() {
		return nomProg;
	}

	public void setNomProg(String nomProg) {
		this.nomProg = nomProg;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public List<Installation> getInstallations() {
		return installations;
	}

	public void setInstallations(List<Installation> installations) {
		this.installations = installations;
	}

}
