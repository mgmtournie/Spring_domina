package com.service;

import java.util.List;

import com.entity.InstalChauffeEau;

public interface IInstalChauffeEauService {
	
	public void addInstalChauffeEau(InstalChauffeEau instal);

	public List<InstalChauffeEau> getAllInstalChauffeEaus();

	public InstalChauffeEau findById(int id);

	public List<InstalChauffeEau> findByType(String type);

	public List<InstalChauffeEau> findByEtat(boolean etat);

	public List<InstalChauffeEau> findByPiece(int idpiece);

	public List<InstalChauffeEau> findByProgramme(int idprog);

	public void actived(InstalChauffeEau instal);

	public void updateInstalChauffeEau(InstalChauffeEau instal);

	public void deleteInstalChauffeEau(InstalChauffeEau instal);
}
