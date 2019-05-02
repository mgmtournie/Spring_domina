package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.CapteurHumiditeDAO;
import com.entity.CapteurHumidite;
import com.entity.Piece;

@Service
public class CapteurHumiditeServiceImpl implements ICapteurHumiditeService {

	@Autowired
	CapteurHumiditeDAO capteurHumidite;

	@Override
	public List<CapteurHumidite> getAllCapteursHumidite() {

		return this.capteurHumidite.findAll();
	}

	@Override
	public CapteurHumidite findByIdCapteur(int id) {
		return this.capteurHumidite.findByIdCapteur(id);
	}

	@Override
	public List<CapteurHumidite> findByPiece(Piece piece) {
		return this.capteurHumidite.findByPiece(piece);
	}

	@Override
	public void addCapteurHumidite(CapteurHumidite capteurHumidite) {
		this.capteurHumidite.save(capteurHumidite);

	}

	@Override
	public void updateCapteurHumidite(CapteurHumidite capteurHumidite) {
		this.capteurHumidite.save(capteurHumidite);

	}

	@Override
	public void deleteCapteurHumidite(CapteurHumidite capteurHumidite) {
		this.capteurHumidite.delete(capteurHumidite);

	}

}
