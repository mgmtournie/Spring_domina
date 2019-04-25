package com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Consommation;

@Repository
public interface ConsommationDAO extends JpaRepository<Consommation, Integer>{

	public Consommation findByIdConsommateur(int idConso); 
	
	public Consommation findByFournisseur (String fournisseur); 
	
	
	
}
