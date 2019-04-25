package com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Personne;

@Repository
public interface PersonneDAO extends JpaRepository<Personne, Integer> {
	public Personne findByUsername(String username);

	public Personne findByNom(String nom);
	
	public Personne findByIdUser( int idUser);


}
