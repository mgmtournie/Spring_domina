package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Consommation;

@Repository
public interface ConsommationDAO extends JpaRepository<Consommation, Integer>{

	public List<Consommation> findByIdConsommateur(int idConso); 
	
	public List<Consommation> findByPieces(int idPiece); 
	
	public Consommation findByInstal(int idinstal);
	
	public List<Consommation> findByType(String type); 
	
	
	
}
