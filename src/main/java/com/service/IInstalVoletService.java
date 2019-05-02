package com.service;

import java.util.List;

import com.entity.InstalVolet;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstalVoletService {

	public void addInstalVolet(InstalVolet instal);

	public List<InstalVolet> getAllInstalsVolet();

	public InstalVolet findById(int id);

	public List<InstalVolet> findByEtat(boolean etat);

	public List<InstalVolet> findByPiece(Piece piece);

	public List<InstalVolet> findByProgrammes(List<Programme> programmes);

	public void actived(InstalVolet instal);

	public void updateInstalVolet(InstalVolet instal);

	public void deleteInstalVolet(InstalVolet instal);
}
