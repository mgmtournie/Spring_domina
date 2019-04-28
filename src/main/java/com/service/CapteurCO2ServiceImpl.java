package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurCO2SDAO;
import com.DAO.ICapteurCO2Service;
import com.entity.CapteurCO2;

@Service
public class CapteurCO2ServiceImpl implements ICapteurCO2Service {

	@Autowired
	CapteurCO2SDAO capteurCO2DAO;

	@Override
	public List<CapteurCO2> getAllCapteursCO2() {
		return this.capteurCO2DAO.findAll();
	}

	@Override
	public CapteurCO2 findByIdCapteurCO2(int id) {
		return this.capteurCO2DAO.findByIdCapteur(id);
	}

	@Override
	public List<CapteurCO2> findByPiece(int idPiece) {
		return this.capteurCO2DAO.findByPiece(idPiece);
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
	public void deleteCapteuCO2r(CapteurCO2 CapteurCO2) {
		this.capteurCO2DAO.delete(CapteurCO2);
	}

}
