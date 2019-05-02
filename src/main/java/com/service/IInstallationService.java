package com.service;

import java.util.List;

import com.entity.Installation;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstallationService {

	public void addInstallation(Installation instal);

	public List<Installation> getAllInstallations();

	public Installation findById(int id);

	public List<Installation> findByType(String type);

	public List<Installation> findByEtat(boolean etat);

	public List<Installation> findByPiece(Piece piece);

	public List<Installation> findByProgramme(List<Programme> programmes);

	public void actived(Installation instal);

	public void updateInstallation(Installation instal);

	public void deleteInstallation(Installation instal);

}
