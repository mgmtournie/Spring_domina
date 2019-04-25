package com.service;

import java.util.List;

import com.entity.Installation;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstallationService {

	public void addInstallation(Installation instal);

	public List<Installation> getAllInstallations();

	public Installation findById(int id);

	public Installation findByType(String type);

	public Installation findByEtat(Boolean etat);

	public Installation findByPiece(Piece piece);

	public Installation findByProgramme(Programme prog);

	public void actived(Installation instal);

	public void updateInstallation(Installation instal);

	public void deleteInstallation(Installation instal);

}
