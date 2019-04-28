package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationDAO;
import com.entity.Consommation;
@Service
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
	public Consommation findByIdConsommateur(int idConsommateur) {
		return this.consommationDAO.findByIdConsommateur(idConsommateur);
	}

	@Override
	public List<Consommation> findByType(String type) {
		return this.consommationDAO.findByType(type);
	}

	@Override
	public void addConsommation(Consommation consommation) {
		this.consommationDAO.save(consommation);
		
	}

	@Override
	public void deleteConsommation(Consommation consommation) {
		this.consommationDAO.delete(consommation);
		
	}

	@Override
	public void updateConsommation(Consommation consommation) {
		this.consommationDAO.save(consommation);
		
	}

}
