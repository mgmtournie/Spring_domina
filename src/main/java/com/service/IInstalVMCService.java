package com.service;

import java.util.List;

import com.entity.InstalVMC;

public interface IInstalVMCService {

	public void addInstalVMC(InstalVMC instal);

	public List<InstalVMC> getAllInstalVMCs();

	public InstalVMC findById(int id);

	public List<InstalVMC> findByType(String type);

	public List<InstalVMC> findByEtat(boolean etat);

	public List<InstalVMC> findByPiece(int idpiece);

	public List<InstalVMC> findByProgramme(int idprog);

	public void actived(InstalVMC instal);

	public void updateInstalVMC(InstalVMC instal);

	public void deleteInstalVMC(InstalVMC instal);
}
