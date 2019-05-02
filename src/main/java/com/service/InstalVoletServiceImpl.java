package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalVoletDAO;
import com.entity.InstalVolet;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class InstalVoletServiceImpl implements IInstalVoletService {

	@Autowired
	InstalVoletDAO instalVoletDAO;

	@Override
	public void addInstalVolet(InstalVolet instal) {
		this.instalVoletDAO.save(instal);

	}

	@Override
	public List<InstalVolet> getAllInstalsVolet() {
		return this.instalVoletDAO.findAll();
	}

	@Override
	public InstalVolet findById(int id) {
		return this.instalVoletDAO.findById(id);
	}

	@Override
	public List<InstalVolet> findByEtat(boolean etat) {
		return this.instalVoletDAO.findByEtat(etat);
	}

	@Override
	public List<InstalVolet> findByPiece(Piece piece) {
		return this.instalVoletDAO.findByPiece(piece);
	}

	@Override
	public List<InstalVolet> findByProgrammes(List<Programme> programmes) {
		return this.instalVoletDAO.findByProgrammes(programmes);
	}

	@Override
	public void actived(InstalVolet instal) {
		this.instalVoletDAO.save(instal);

	}

	@Override
	public void updateInstalVolet(InstalVolet instal) {
		this.instalVoletDAO.save(instal);

	}

	@Override
	public void deleteInstalVolet(InstalVolet instal) {
		this.instalVoletDAO.delete(instal);

	}

}
