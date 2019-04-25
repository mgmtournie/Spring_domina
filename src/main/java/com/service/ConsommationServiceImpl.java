package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DAO.ConsommationDAO;
import com.entity.Consommation;

public class ConsommationServiceImpl implements IConsommationService {

	@Autowired
	ConsommationDAO consommationDAO;

	@Override
	public List<Consommation> getAllConsommations() {
		return this.consommationDAO.findAll();
	}

	@Override
	public List<Consommation> findByPieces(int idpiece) {
		return this.consommationDAO.findByPieces(idpiece);
	}

	@Override
	public Consommation findByInstal(int idinstal) {
		return this.consommationDAO.findByInstal(idinstal);
	}

	@Override
	public List<Consommation> findByIdConsommateur(int idConsommateur) {
		return this.consommationDAO.findByIdConsommateur(idConsommateur);
	}

	@Override
	public List<Consommation> findByType(String type) {
		return this.consommationDAO.findByType(type);
	}

}
