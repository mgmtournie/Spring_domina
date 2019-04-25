package com.service;

import java.util.List;

import com.entity.Consommation;
import com.entity.Installation;
import com.entity.Piece;

public interface IConsommationService {

	public List<Consommation> getAllConsommations();
	
	public List<Consommation> findByType(String type);

	public List<Consommation> findByPiece(Piece piece);

	public Consommation findByInstallation(Installation instal);

	public List<Consommation> findByIdConsommateur(int idConsommateur);
	
	
}
