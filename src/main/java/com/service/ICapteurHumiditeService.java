package com.service;

import java.util.List;

import com.entity.CapteurHumidite;

public interface ICapteurHumiditeService {
	
	public List<CapteurHumidite> getAllCapteurHumidites();

	public CapteurHumidite findByIdCapteurHumidite(int id);

	public List<CapteurHumidite> findByPiece(int idPiece);
	
	public void addCapteurHumidite (CapteurHumidite capteurHumidite); 
	
	public void  updateCapteurHumidite (CapteurHumidite capteurHumidite); 
	
	public void deleteCapteurHumidite (CapteurHumidite capteurHumidite); 

}
