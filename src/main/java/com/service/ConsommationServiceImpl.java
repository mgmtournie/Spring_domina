package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.DAO.ConsommationDAO;
import com.entity.Consommation;
import com.entity.Installation;
import com.entity.Piece;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consommation> findByIdConsommateur(int idConsommateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Consommation> findByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
