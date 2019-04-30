package com.service;

import java.util.List;

import com.entity.InstalVolet;

public interface IInstalVoletService {

	public void addInstalVolet(InstalVolet instal);

	public List<InstalVolet> getAllInstalsVolet();

	public InstalVolet findById(int id);

	public List<InstalVolet> findByEtat(boolean etat);

	public List<InstalVolet> findByPiece(int idpiece);

	public List<InstalVolet> findByProgrammes(int idprog);

	public void actived(InstalVolet instal);

	public void updateInstalVolet(InstalVolet instal);

	public void deleteInstalVolet(InstalVolet instal);
}
