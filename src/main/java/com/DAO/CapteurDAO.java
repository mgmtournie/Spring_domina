package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Capteur;

@Repository
public interface CapteurDAO extends JpaRepository<Capteur, Integer>{
	
	 public Capteur findByIdCapteur (int idCapteur);
	 
	 public  List<Capteur> findByPiece (int idPiece); 
	 
	 public List<Capteur> findByType (String type); 
	 
	 

}
