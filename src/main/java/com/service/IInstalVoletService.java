package com.service;

import java.util.List;

import com.entity.InstalVolet;

public interface IInstalVoletService {

	public void addInstalVolet(InstalVolet instal);

	public List<InstalVolet> getAllInstalVolets();

	public InstalVolet findById(int id);

	public List<InstalVolet> findByType(String type);

	public List<InstalVolet> findByEtat(boolean etat);

	public List<InstalVolet> findByPiece(int idpiece);

	public List<InstalVolet> findByProgramme(int idprog);

	public void actived(InstalVolet instal);

	public void updateInstalVolet(InstalVolet instal);

	public void deleteInstalVolet(InstalVolet instal);
}
