package com.service;

import java.util.List;

import com.entity.CapteurCO2;
import com.entity.Piece;

public interface ICapteurCO2Service {

	public List<CapteurCO2> getAllCapteursCO2();

	public CapteurCO2 findByIdCapteur(int id);

	public List<CapteurCO2> findByPiece(Piece piece);

	public void addCapteurCO2(CapteurCO2 capteurCO2);

	public void updateCapteurCO2(CapteurCO2 capteurCO2);

	public void deleteCapteurCO2(CapteurCO2 CapteurCO2);

}
