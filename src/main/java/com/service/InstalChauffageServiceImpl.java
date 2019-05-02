package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalChauffageDAO;
import com.entity.InstalChauffage;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class InstalChauffageServiceImpl implements IInstalChauffageService {

	@Autowired
	InstalChauffageDAO instalChauffageDAO;

	@Override
	public void addInstalChauffage(InstalChauffage instal) {
		this.instalChauffageDAO.save(instal);

	}

	@Override
	public List<InstalChauffage> getAllInstalsChauffage() {
		return this.instalChauffageDAO.findAll();
	}

	@Override
	public InstalChauffage findById(int id) {
		return this.instalChauffageDAO.findById(id);
	}

	@Override
	public List<InstalChauffage> findByEtat(boolean etat) {
		return this.instalChauffageDAO.findByEtat(etat);
	}

	@Override
	public List<InstalChauffage> findByPiece(Piece piece) {
		return this.instalChauffageDAO.findByPiece(piece);
	}

	@Override
	public List<InstalChauffage> findByProgramme(List<Programme> programmes) {
		return this.instalChauffageDAO.findByProgrammes(programmes);
	}

	@Override
	public void actived(InstalChauffage instal) {
		this.instalChauffageDAO.save(instal);

	}

	@Override
	public void updateInstalChauffage(InstalChauffage instal) {
		this.instalChauffageDAO.save(instal);

	}

	@Override
	public void deleteInstalChauffage(InstalChauffage instal) {
		this.instalChauffageDAO.delete(instal);

	}

}
