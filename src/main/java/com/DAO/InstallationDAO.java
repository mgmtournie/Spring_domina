package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Installation;
import com.entity.Piece;

@Repository
public interface InstallationDAO  extends JpaRepository<Installation, Double>{
	// findbynom, find by etat
	public List<Installation> findByNomInstal(String type);
	
	public List<Installation> findByPiece(int idPiece);
	
	public Installation findById(int idInstall); 
	
	public  List<Installation> findByProgrammes (int idProg); 
	
	public  Installation findByEtat (boolean etat); 
	
	

}
