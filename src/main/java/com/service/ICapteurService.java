package com.service;

import java.util.List;

import com.entity.Capteur;

import com.entity.Piece;

public interface ICapteurService {

	public List<Capteur> getAllCapteurs();

	public Capteur findByIdCapteur(int id);

	public List<Capteur> findByType(String type);

	public List<Capteur> findByPiece(int idPiece);
}
