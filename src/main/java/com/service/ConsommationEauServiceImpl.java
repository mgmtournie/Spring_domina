package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationEauDAO;
import com.entity.ConsommationEau;
import com.entity.Installation;
import com.entity.Piece;

@Service
public class ConsommationEauServiceImpl implements IConsommationEauService {

	@Autowired
	ConsommationEauDAO ConsommationEauDAO;

	@Override
	public List<ConsommationEau> getAllConsommationsEau() {
		return this.ConsommationEauDAO.findAll();
	}

	@Override
	public List<ConsommationEau> findByPiece(Piece piece) {
		return this.ConsommationEauDAO.findByPiece(piece);
	}

	@Override
	public ConsommationEau findByInstal(Installation instal) {
		return this.ConsommationEauDAO.findByInstal(instal);
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
