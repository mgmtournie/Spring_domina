package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;

	@Column(name = "rolename")
	private String roleName;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id_user")
	private Personne personne;

}
