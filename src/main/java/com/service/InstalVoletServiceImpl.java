package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstalVoletDAO;
import com.entity.InstalVolet;

@Service
public class InstalVoletServiceImpl implements IInstalVoletService{

	@Autowired
	InstalVoletDAO instalVoletDAO;

	@Override
	public void addInstalVolet(InstalVolet instal) {
		this.instalVoletDAO.save(instal);
		
	}

	@Override
	public List<InstalVolet> getAllInstalVolets() {
		return this.instalVoletDAO.findAll();
	}

	@Override
	public InstalVolet findById(int id) {
		return this.instalVoletDAO.findById(id);
	}

	@Override
	public List<InstalVolet> findByType(String type) {
		return this.instalVoletDAO.findByType(type);
	}

	@Override
	public List<InstalVolet> findByEtat(boolean etat) {
		return this.instalVoletDAO.findByEtat(etat);
	}

	@Override
	public List<InstalVolet> findByPiece(int idpiece) {
		return this.instalVoletDAO.findByPiece(idpiece);
	}

	@Override
	public List<InstalVolet> findByProgramme(int idprog) {
		return this.instalVoletDAO.findByProgrammes(idprog);
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
