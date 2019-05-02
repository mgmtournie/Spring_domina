package com.service;

import java.util.List;

import com.entity.InstalChauffeEau;
import com.entity.Piece;
import com.entity.Programme;

public interface IInstalChauffeEauService {

	public void addInstalChauffeEau(InstalChauffeEau instal);

	public List<InstalChauffeEau> getAllInstalsChauffeEau();

	public InstalChauffeEau findById(int id);

	public List<InstalChauffeEau> findByEtat(boolean etat);

	public List<InstalChauffeEau> findByPiece(Piece piece);

	public List<InstalChauffeEau> findByProgrammes(List<Programme> programmes);

	public void actived(InstalChauffeEau instal);

	public void updateInstalChauffeEau(InstalChauffeEau instal);

	public void deleteInstalChauffeEau(InstalChauffeEau instal);
}
