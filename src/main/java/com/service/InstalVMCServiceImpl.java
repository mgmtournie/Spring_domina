package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalVMCDAO;
import com.entity.InstalVMC;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class InstalVMCServiceImpl implements IInstalVMCService {

	@Autowired
	InstalVMCDAO instalVMCDAO;

	@Override
	public void addInstalVMC(InstalVMC instal) {
		this.instalVMCDAO.save(instal);

	}

	@Override
	public List<InstalVMC> getAllInstalsVMC() {
		return this.instalVMCDAO.findAll();
	}

	@Override
	public InstalVMC findById(int id) {
		return this.instalVMCDAO.findById(id);
	}

	@Override
	public List<InstalVMC> findByEtat(boolean etat) {
		return this.instalVMCDAO.findByEtat(etat);
	}

	@Override
	public List<InstalVMC> findByPiece(Piece piece) {
		return this.instalVMCDAO.findByPiece(piece);
	}

	@Override
	public List<InstalVMC> findByProgrammes(List<Programme> programmes) {
		return this.instalVMCDAO.findByProgrammes(programmes);
	}

	@Override
	public void actived(InstalVMC instal) {
		this.instalVMCDAO.save(instal);

	}

	@Override
	public void updateInstalVMC(InstalVMC instal) {
		this.instalVMCDAO.save(instal);

	}

	@Override
	public void deleteInstalVMC(InstalVMC instal) {
		this.instalVMCDAO.delete(instal);

	}

}
