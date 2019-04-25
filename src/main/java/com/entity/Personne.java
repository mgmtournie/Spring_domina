package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;

	@Column(name = "LASTNAME")
	private String nom;
	@Column(name = "FIRSTNAME")
	private String prenom;

	private String username;
	private String password;

	private boolean actived;

	@OneToMany(mappedBy = "personne")
	private List<Role> roles;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int id, String nom) {
		super();
		this.nom = nom;
		this.id_user = id;
	}

	public Personne(int id_user, String nom, String prenom, String username, String password, boolean actived,
			List<Role> roles) {
		super();
		this.id_user = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		this.actived = actived;
		this.roles = roles;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
