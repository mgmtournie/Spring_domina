package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.InstallationDAO;
import com.entity.Installation;
@Service
public class InstallationServiceImpl implements IInstallationService {

	@Autowired
	InstallationDAO installationDAO;

	@Override
	public void addInstallation(Installation instal) {
		this.installationDAO.save(instal);
	}

	@Override
	public List<Installation> getAllInstallations() {
		return this.installationDAO.findAll();
	}

	@Override
	public Installation findById(int id) {
		return this.installationDAO.findById(id);
	}

	@Override
	public List<Installation> findByType(String type) {
		return this.installationDAO.findByType(type);
	}

	@Override
	public List<Installation> findByEtat(boolean etat) {
		return this.installationDAO.findByEtat(etat);
	}

	@Override
	public List<Installation> findByPiece(int idpiece) {
		return this.installationDAO.findByPiece(idpiece);
	}

	@Override
	public List<Installation> findByProgramme(int idprog) {
		return this.installationDAO.findByProgrammes(idprog);
	}

	@Override
	public void actived(Installation instal) {
		this.installationDAO.save(instal);
	}

	@Override
	public void updateInstallation(Installation instal) {
		this.installationDAO.save(instal);
	}

	@Override
	public void deleteInstallation(Installation instal) {
		this.installationDAO.delete(instal);
	}

}
