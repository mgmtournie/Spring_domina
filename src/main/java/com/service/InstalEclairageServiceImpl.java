package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalEclairageDAO;
import com.entity.InstalEclairage;

@Service
public class InstalEclairageServiceImpl implements IInstalEclairageService {

	@Autowired
	InstalEclairageDAO instalEclairageDAO;

	@Override
	public void addInstalEclairage(InstalEclairage instal) {
		this.instalEclairageDAO.save(instal);
		
	}

	@Override
	public List<InstalEclairage> getAllInstalEclairages() {
		return this.instalEclairageDAO.findAll();
	}

	@Override
	public InstalEclairage findById(int id) {
		return this.instalEclairageDAO.findById(id);
	}

	@Override
	public List<InstalEclairage> findByType(String type) {
		return this.instalEclairageDAO.findByType(type);
	}

	@Override
	public List<InstalEclairage> findByEtat(boolean etat) {
		return this.instalEclairageDAO.findByEtat(etat);
	}

	@Override
	public List<InstalEclairage> findByPiece(int idpiece) {
		return this.instalEclairageDAO.findByPiece(idpiece);
	}

	@Override
	public List<InstalEclairage> findByProgramme(int idprog) {
		return this.instalEclairageDAO.findByProgrammes(idprog);
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
