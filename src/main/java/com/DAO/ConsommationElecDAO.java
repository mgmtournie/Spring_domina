package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationElec;

@Repository
public interface ConsommationElecDAO extends JpaRepository<ConsommationElec, Integer>{

	public ConsommationElec findByIdConsommateur(int idConso); 
	
	public List<ConsommationElec> findByPieces(int idPiece); 
	
	public ConsommationElec findByInstal(int idinstal);


}
