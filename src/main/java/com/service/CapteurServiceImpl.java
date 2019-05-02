package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurDAO;
import com.entity.Capteur;
import com.entity.Piece;

@Service
public class CapteurServiceImpl implements ICapteurService {

	@Autowired
	CapteurDAO capteurDAO;

	@Override
	public List<Capteur> getAllCapteurs() {
		return this.capteurDAO.findAll();
	}

	@Override
	public Capteur findByIdCapteur(int id) {
		return this.capteurDAO.findByIdCapteur(id);
	}

	@Override
	public List<Capteur> findByType(String type) {
		return this.capteurDAO.findByType(type);
	}

	@Override
	public List<Capteur> findByPiece(Piece piece) {
		return this.capteurDAO.findByPiece(piece);
	}

	@Override
	public void addCapteur(Capteur capteur) {
		this.capteurDAO.save(capteur);

	}

	@Override
	public void updateCapteur(Capteur capteur) {
		this.capteurDAO.save(capteur);

	}

	@Override
	public void deleteCapteur(Capteur capteur) {
		this.capteurDAO.delete(capteur);

	}

}
