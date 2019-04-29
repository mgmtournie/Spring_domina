package com.service;

import java.util.List;

import com.entity.InstalChauffage;

public interface IInstalChauffageService {

	public void addInstalChauffage(InstalChauffage instal);

	public List<InstalChauffage> getAllInstalChauffages();

	public InstalChauffage findById(int id);

	public List<InstalChauffage> findByType(String type);

	public List<InstalChauffage> findByEtat(boolean etat);

	public List<InstalChauffage> findByPiece(int idpiece);

	public List<InstalChauffage> findByProgramme(int idprog);

	public void actived(InstalChauffage instal);

	public void updateInstalChauffage(InstalChauffage instal);

	public void deleteInstalChauffage(InstalChauffage instal);

}
