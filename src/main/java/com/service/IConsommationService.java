package com.service;

import java.util.List;

import com.entity.Consommation;

public interface IConsommationService {

	public List<Consommation> getAllConsommations();

	public List<Consommation> findByType(String type);

	public List<Consommation> findByPieces(int idpiece);

	public Consommation findByInstal(int idinstal);

	public Consommation findByIdConsommateur(int idConsommateur);

	public void addConsommation(Consommation consommation);

	public void deleteConsommation(Consommation consommation);

	public void updateConsommation(Consommation consommation);

}
