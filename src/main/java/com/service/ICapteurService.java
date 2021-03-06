package com.service;

import java.util.List;

import com.entity.Capteur;
import com.entity.Piece;

public interface ICapteurService {

	public List<Capteur> getAllCapteurs();

	public Capteur findByIdCapteur(int id);

	public List<Capteur> findByType(String type);

	public List<Capteur> findByPiece(Piece piece);

	public void addCapteur(Capteur capteur);

	public void updateCapteur(Capteur capteur);

	public void deleteCapteur(Capteur Capteur);

}
