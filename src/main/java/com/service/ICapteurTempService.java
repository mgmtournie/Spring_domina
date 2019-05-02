package com.service;

import java.util.List;

import com.entity.CapteurTemp;
import com.entity.Piece;

public interface ICapteurTempService {

	public List<CapteurTemp> getAllCapteursTemp();

	public CapteurTemp findByIdCapteur(int id);

	public List<CapteurTemp> findByPiece(Piece piece);

	public void addCapteurTemp(CapteurTemp capteurTemp);

	public void updateCapteurTemp(CapteurTemp capteurTemp);

	public void deleteCapteurTemp(CapteurTemp CapteurTemp);

}
