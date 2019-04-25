package com.DAO;

import org.springframework.stereotype.Repository;

import com.entity.Consommation;

@Repository
public interface ConsommationDAO {

	public Consommation FoundByIdFournisseur(int idFournisseur); 
	
	public Consommation FoundById(int id);
}
