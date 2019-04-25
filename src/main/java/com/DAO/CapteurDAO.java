package com.DAO;

import org.springframework.stereotype.Repository;

import com.entity.Capteur;

@Repository
public interface CapteurDAO {
	 public Capteur foundByIdCapteur(int idCapteur);
	 
	 

}
