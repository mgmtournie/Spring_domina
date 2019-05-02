package com.service;

import java.util.List;

import com.entity.Consommation;
import com.entity.Installation;
import com.entity.Piece;

public interface IConsommationService {

	public List<Consommation> getAllConsommations();

	public List<Consommation> findByType(String type);

	public List<Consommation> findByPiece(Piece piece);

	public Consommation findByInstal(Installation instal);

	public Consommation findByIdConsommateur(int idConsommateur);

	public void addConsommation(Consommation consommation);

	public void deleteConsommation(Consommation consommation);

	public void updateConsommation(Consommation consommation);

}
