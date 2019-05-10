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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * 
 * @author LAVY Livia, Mathilde TOURNIE
 * 
 * <b>Piece est la classe représentant une piece équipée d'une maison connectée. </b>
 * <p>
 * Une piece est caractérisée par les informations suivantes :
 * <ul>
 * <li>Un identifiant unique attribué définitivement.</li>
 * <li>Un nom.</li>
 * <li>Une superficie.</li>
 * <li>Une liste de programmes.</li>
 * <li>Une liste d'installations.</li>
 * <li>Une liste de capteurs.</li>
 * <li>Une consommation spécifique à la piece.</li>
 * </ul>
 * </p>
 * <p>
 * L'utilisateur va pouvoir manager les valeurs de nom, superficie. Les listes de programmes, capteurs et installations
 * seront gérés par l'utilisateurs à travers des transactions concernant d'autres classes.
 *</p>
 *
 */
@Entity
@Table(name = "rooms")
public class Piece {
	
	/**
	 * L'ID de la piece. Cet ID n'est pas modifiable.
	 * 
	 * @see Piece#Piece(int, String, int, List, List, List, Consommation)
	 * @see Piece#getIdPiece()
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ROOM")
	private int idPiece;

	/**
	 * Le nom de la piece. Ce nom est changeable.
	 * 
	 * @see Piece#getNomPiece()
	 * @see Piece#setNomPiece(String)
	 */
	@Column(name = "ROOM_NAME")
	private String nomPiece;

	/**
	 * La superficie de la piece. Cette superficie est changeable.
	 * 
	 * @see Piece#getSuperficieM2()
	 * @see Piece#setSuperficieM2(int)
	 */
	@Column(name = "SUPERFICIE")
	private int superficieM2;

	/**
	 * La liste des programmes associés à la piece.
	 * 
	 * @see Piece#getProgrammes()
	 */
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Programme> programmes = new ArrayList<Programme>();
	
	 /** 
	  * La liste des installations présentent dans la piece.
	  * 
	  * @see Piece#getInstallations()
	  */
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Installation> installations = new ArrayList<Installation>();

	/**
	 * La Liste des capteurs présent dans la pièce.
	 * 
	 * @see Piece#getCapteurs()
	 */
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Capteur> capteurs = new ArrayList<Capteur>();

	/**
	 * La consommation energétique de la piece
	 * 
	 * @see Piece#getConso()
	 */
	@JsonIgnore
	@OneToOne
	Consommation conso;
	
	/**
	 * Constructeur vide la Piece.
	 */
	public Piece() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur Piece.
	 * 
	 * @param idPiece
	 * 		L'identifiant unique de la piece.
	 * @param nomPiece
	 * 		Le nom de la piece.
	 * @param superficieM2
	 * 		La superficie de la piece.
	 * @param programmes
	 * @param installations
	 * @param capteurs
	 * @param conso
	 */
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
/**
 * Retourne l'id de la piece
 * @return
 */
	public int getIdPiece() {
		return idPiece;
	}
/**
 * Met à jour l'id de la piece
 * @param idPiece
 */
	public void setIdPiece(int idPiece) {
		this.idPiece = idPiece;
	}
/**
 * 
 * @return
 */
	public String getNomPiece() {
		return nomPiece;
	}
/**
 * 
 * @param nomPiece
 */
	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}
/**
 * 
 * @return
 */
	public int getSuperficieM2() {
		return superficieM2;
	}
/**
 * 
 * @param superficieM2
 */
	public void setSuperficieM2(int superficieM2) {
		this.superficieM2 = superficieM2;
	}
/**
 * 
 * @return
 */
	public List<Programme> getProgrammes() {
		return programmes;
	}
/**
 * 
 * @param programmes
 */
	public void setProgrammes(List<Programme> programmes) {
		this.programmes = programmes;
	}
/**
 * 
 * @return
 */
	public List<Installation> getInstallations() {
		return installations;
	}
/**
 * 
 * @param installations
 */
	public void setInstallations(List<Installation> installations) {
		this.installations = installations;
	}
/**
 * 
 * @return
 */
	public List<Capteur> getCapteurs() {
		return capteurs;
	}
/**
 * 
 * @param capteurs
 */
	public void setCapteurs(List<Capteur> capteurs) {
		this.capteurs = capteurs;
	}
/**
 * 
 * @return
 */
	public Consommation getConso() {
		return conso;
	}
/**
 * 
 * @param conso
 */
	public void setConso(Consommation conso) {
		this.conso = conso;
	}

}
