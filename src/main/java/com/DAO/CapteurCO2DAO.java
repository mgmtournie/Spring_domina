package com.DAO;

import org.springframework.stereotype.Repository;

import com.entity.CapteurCO2;

@Repository
public interface CapteurCO2DAO {
	
	public CapteurCO2 foundById(); 

}
