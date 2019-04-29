package com.service;

import java.util.List;

import com.entity.InstalEclairage;

public interface IInstalEclairageService {

	public void addInstalEclairage(InstalEclairage instal);

	public List<InstalEclairage> getAllInstalEclairages();

	public InstalEclairage findById(int id);

	public List<InstalEclairage> findByType(String type);

	public List<InstalEclairage> findByEtat(boolean etat);

	public List<InstalEclairage> findByPiece(int idpiece);

	public List<InstalEclairage> findByProgramme(int idprog);

	public void actived(InstalEclairage instal);

	public void updateInstalEclairage(InstalEclairage instal);

	public void deleteInstalEclairage(InstalEclairage instal);
}
