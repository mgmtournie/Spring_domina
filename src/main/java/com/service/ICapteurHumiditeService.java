package com.service;

import java.util.List;

import com.entity.CapteurHumidite;
import com.entity.Piece;

public interface ICapteurHumiditeService {

	public List<CapteurHumidite> getAllCapteursHumidite();

	public CapteurHumidite findByIdCapteur(int id);

	public List<CapteurHumidite> findByPiece(Piece piece);

	public void addCapteurHumidite(CapteurHumidite capteurHumidite);

	public void updateCapteurHumidite(CapteurHumidite capteurHumidite);

	public void deleteCapteurHumidite(CapteurHumidite capteurHumidite);

}
