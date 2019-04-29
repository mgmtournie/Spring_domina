package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationEauDAO;
import com.entity.ConsommationEau;

@Service
public class ConsommationEauServiceImpl implements IConsommationEauService {

	@Autowired
	ConsommationEauDAO ConsommationEauDAO;

	@Override
	public List<ConsommationEau> getAllConsommationEaus() {
		return this.ConsommationEauDAO.findAll();
	}

	@Override
	public List<ConsommationEau> findByPieces(int idpiece) {
		return this.ConsommationEauDAO.findByPieces(idpiece);
	}

	@Override
	public ConsommationEau findByInstal(int idinstal) {
		return this.ConsommationEauDAO.findByInstal(idinstal);
	}

	@Override
	public ConsommationEau findByIdConsommateur(int idConsommateur) {
		return this.ConsommationEauDAO.findByIdConsommateur(idConsommateur);
	}


	@Override
	public void addConsommationEau(ConsommationEau ConsommationEau) {
		this.ConsommationEauDAO.save(ConsommationEau);
		
	}

	@Override
	public void deleteConsommationEau(ConsommationEau ConsommationEau) {
		this.ConsommationEauDAO.delete(ConsommationEau);
		
	}

	@Override
	public void updateConsommationEau(ConsommationEau ConsommationEau) {
		this.ConsommationEauDAO.save(ConsommationEau);
		
	}

}
