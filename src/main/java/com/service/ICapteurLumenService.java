package com.service;

import java.util.List;

import com.entity.CapteurLumen;
import com.entity.Piece;

public interface ICapteurLumenService {

	public List<CapteurLumen> getAllCapteursLumen();

	public CapteurLumen findByIdCapteur(int id);

	public List<CapteurLumen> findByPiece(Piece piece);

	public void addCapteurLumen(CapteurLumen capteurLumen);

	public void updateCapteurLumen(CapteurLumen capteurLumen);

	public void deleteCapteurLumen(CapteurLumen capteurLumen);

}
