package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurLumenDAO;
import com.entity.CapteurLumen;
import com.entity.Piece;

@Service
public class CapteurLumenServiceImpl implements ICapteurLumenService {

	@Autowired
	CapteurLumenDAO capteurLumen;

	@Override
	public List<CapteurLumen> getAllCapteursLumen() {

		return this.capteurLumen.findAll();
	}

	@Override
	public CapteurLumen findByIdCapteur(int id) {
		return this.capteurLumen.findByIdCapteur(id);
	}

	@Override
	public List<CapteurLumen> findByPiece(Piece piece) {
		return this.findByPiece(piece);
	}

	@Override
	public void addCapteurLumen(CapteurLumen capteurLumen) {
		this.capteurLumen.save(capteurLumen);

	}

	@Override
	public void updateCapteurLumen(CapteurLumen capteurLumen) {
		this.capteurLumen.save(capteurLumen);

	}

	@Override
	public void deleteCapteurLumen(CapteurLumen capteurLumen) {
		this.capteurLumen.delete(capteurLumen);

	}

}
