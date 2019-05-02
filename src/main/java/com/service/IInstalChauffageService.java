package com.service;

import java.util.List;

import com.entity.InstalChauffage;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstalChauffageService {

	public void addInstalChauffage(InstalChauffage instal);

	public List<InstalChauffage> getAllInstalsChauffage();

	public InstalChauffage findById(int id);

	public List<InstalChauffage> findByEtat(boolean etat);

	public List<InstalChauffage> findByPiece(Piece piece);

	public List<InstalChauffage> findByProgramme(List<Programme> programmes);

	public void actived(InstalChauffage instal);

	public void updateInstalChauffage(InstalChauffage instal);

	public void deleteInstalChauffage(InstalChauffage instal);

}
