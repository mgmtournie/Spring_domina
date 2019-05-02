package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurTempDAO;
import com.entity.CapteurTemp;
import com.entity.Piece;

@Service
public class CapteurTempServiceImpl implements ICapteurTempService {

	@Autowired
	CapteurTempDAO capteurTempDAO;

	@Override
	public List<CapteurTemp> getAllCapteursTemp() {
		return this.capteurTempDAO.findAll();
	}

	@Override
	public CapteurTemp findByIdCapteur(int id) {
		return this.capteurTempDAO.findByIdCapteur(id);
	}

	@Override
	public List<CapteurTemp> findByPiece(Piece piece) {
		return this.capteurTempDAO.findByPiece(piece);
	}

	@Override
	public void addCapteurTemp(CapteurTemp capteurTemp) {
		this.capteurTempDAO.save(capteurTemp);
	}

	@Override
	public void updateCapteurTemp(CapteurTemp capteurTemp) {
		this.capteurTempDAO.save(capteurTemp);
	}

	@Override
	public void deleteCapteurTemp(CapteurTemp CapteurTemp) {
		this.capteurTempDAO.delete(CapteurTemp);
	}

}
