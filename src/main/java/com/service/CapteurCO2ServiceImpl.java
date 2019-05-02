package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurCO2DAO;
import com.entity.CapteurCO2;
import com.entity.Piece;

@Service
public class CapteurCO2ServiceImpl implements ICapteurCO2Service {

	@Autowired
	CapteurCO2DAO capteurCO2DAO;

	@Override
	public List<CapteurCO2> getAllCapteursCO2() {
		return this.capteurCO2DAO.findAll();
	}


	public CapteurCO2 findByIdCapteurCO2(int id) {
		return this.capteurCO2DAO.findByIdCapteur(id);
	}

	@Override
	public List<CapteurCO2> findByPiece(Piece piece) {
		return this.capteurCO2DAO.findByPiece(piece);
	}

	@Override
	public void addCapteurCO2(CapteurCO2 capteurCO2) {
		this.capteurCO2DAO.save(capteurCO2);
	}

	@Override
	public void updateCapteurCO2(CapteurCO2 capteurCO2) {
		this.capteurCO2DAO.save(capteurCO2);
	}

	@Override
	public void deleteCapteurCO2(CapteurCO2 CapteurCO2) {
		this.capteurCO2DAO.delete(CapteurCO2);
	}

	@Override
	public CapteurCO2 findByIdCapteur(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
