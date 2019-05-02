package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalEclairageDAO;
import com.entity.InstalEclairage;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class InstalEclairageServiceImpl implements IInstalEclairageService {

	@Autowired
	InstalEclairageDAO instalEclairageDAO;

	@Override
	public void addInstalEclairage(InstalEclairage instal) {
		this.instalEclairageDAO.save(instal);

	}

	@Override
	public List<InstalEclairage> getAllInstalsEclairage() {
		return this.instalEclairageDAO.findAll();
	}

	@Override
	public InstalEclairage findById(int id) {
		return this.instalEclairageDAO.findById(id);
	}

	@Override
	public List<InstalEclairage> findByEtat(boolean etat) {
		return this.instalEclairageDAO.findByEtat(etat);
	}

	@Override
	public List<InstalEclairage> findByPiece(Piece piece) {
		return this.instalEclairageDAO.findByPiece(piece);
	}

	@Override
	public List<InstalEclairage> findByProgrammes(List<Programme> programmes){
		return this.instalEclairageDAO.findByProgrammes(programmes);
	}

	@Override
	public void actived(InstalEclairage instal) {
		this.instalEclairageDAO.save(instal);

	}

	@Override
	public void updateInstalEclairage(InstalEclairage instal) {
		this.instalEclairageDAO.save(instal);

	}

	@Override
	public void deleteInstalEclairage(InstalEclairage instal) {
		this.instalEclairageDAO.delete(instal);

	}

}
