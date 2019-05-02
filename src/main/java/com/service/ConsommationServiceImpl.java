package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationDAO;
import com.entity.Consommation;
import com.entity.Installation;
import com.entity.Piece;
@Service
public class ConsommationServiceImpl implements IConsommationService {

	@Autowired
	ConsommationDAO consommationDAO;

	@Override
	public List<Consommation> getAllConsommations() {
		return this.consommationDAO.findAll();
	}

	@Override
	public List<Consommation> findByPiece(Piece piece) {
		return this.consommationDAO.findByPiece(piece);
	}

	@Override
	public Consommation findByInstal(Installation instal) {
		return this.consommationDAO.findByInstal(instal);
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
