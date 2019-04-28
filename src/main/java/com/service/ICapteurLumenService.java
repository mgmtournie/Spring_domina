package com.service;

import java.util.List;

import com.entity.CapteurLumen;

public interface ICapteurLumenService {
	
	public List<CapteurLumen> getAllCapteurLumens();

	public CapteurLumen findByIdCapteurLumen(int id);

	public List<CapteurLumen> findByPiece(int idPiece);

	public void addCapteurLumen(CapteurLumen capteurLumen);

	public void updateCapteurLumen(CapteurLumen capteurLumen);

	public void deleteCapteurLumen(CapteurLumen capteurLumen);


}
