package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalChauffeEauDAO;
import com.entity.InstalChauffeEau;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class InstalChauffeEauServiceImpl implements IInstalChauffeEauService {

	@Autowired
	InstalChauffeEauDAO instalChauffeEauDAO;

	@Override
	public void addInstalChauffeEau(InstalChauffeEau instal) {
		this.instalChauffeEauDAO.save(instal);

	}

	@Override
	public List<InstalChauffeEau> getAllInstalsChauffeEau() {
		return this.instalChauffeEauDAO.findAll();
	}

	@Override
	public InstalChauffeEau findById(int id) {
		return this.instalChauffeEauDAO.findById(id);
	}

	@Override
	public List<InstalChauffeEau> findByEtat(boolean etat) {
		return this.instalChauffeEauDAO.findByEtat(etat);
	}

	@Override
	public List<InstalChauffeEau> findByPiece(Piece piece) {
		return this.instalChauffeEauDAO.findByPiece(piece);
	}

	@Override
	public List<InstalChauffeEau> findByProgrammes(List<Programme> programmes) {
		return this.instalChauffeEauDAO.findByProgrammes(programmes);
	}

	@Override
	public void actived(InstalChauffeEau instal) {
		this.instalChauffeEauDAO.save(instal);

	}

	@Override
	public void updateInstalChauffeEau(InstalChauffeEau instal) {
		this.instalChauffeEauDAO.save(instal);

	}

	@Override
	public void deleteInstalChauffeEau(InstalChauffeEau instal) {
		this.instalChauffeEauDAO.delete(instal);

	}

}
