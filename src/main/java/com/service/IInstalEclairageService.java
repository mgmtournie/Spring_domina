package com.service;

import java.util.List;

import com.entity.InstalEclairage;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstalEclairageService {

	public void addInstalEclairage(InstalEclairage instal);

	public List<InstalEclairage> getAllInstalsEclairage();

	public InstalEclairage findById(int id);

	public List<InstalEclairage> findByEtat(boolean etat);

	public List<InstalEclairage> findByPiece(Piece piece);

	public List<InstalEclairage> findByProgrammes(List<Programme> programmes);

	public void actived(InstalEclairage instal);

	public void updateInstalEclairage(InstalEclairage instal);

	public void deleteInstalEclairage(InstalEclairage instal);
}
