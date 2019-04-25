package com.DAO;

import org.springframework.stereotype.Repository;

import com.entity.CapteurHumidite;

@Repository
public interface CapteurHumiditeDAO {
	
	public CapteurHumidite  foundByIdCapteur(int idCapteurHumidite); 

}
