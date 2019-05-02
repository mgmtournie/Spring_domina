package com.service;

import java.util.List;

import com.entity.InstalVMC;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstalVMCService {

	public void addInstalVMC(InstalVMC instal);

	public List<InstalVMC> getAllInstalsVMC();

	public InstalVMC findById(int id);

	public List<InstalVMC> findByEtat(boolean etat);

	public List<InstalVMC> findByPiece(Piece piece);

	public List<InstalVMC> findByProgrammes(List<Programme> programmes);

	public void actived(InstalVMC instal);

	public void updateInstalVMC(InstalVMC instal);

	public void deleteInstalVMC(InstalVMC instal);
}
