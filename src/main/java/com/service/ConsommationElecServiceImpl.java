package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationElecDAO;
import com.entity.ConsommationElec;
import com.entity.Installation;
import com.entity.Piece;

@Service
public class ConsommationElecServiceImpl implements IConsommationElecService {

	@Autowired
	ConsommationElecDAO ConsommationElecDAO;

	@Override
	public List<ConsommationElec> getAllConsommationsElec() {
		return this.ConsommationElecDAO.findAll();
	}

	@Override
	public List<ConsommationElec> findByPiece(Piece piece) {
		return this.ConsommationElecDAO.findByPiece(piece);
	}

	@Override
	public ConsommationElec findByInstal(Installation instal) {
		return this.ConsommationElecDAO.findByInstal(instal);
	}

	@Override
	public ConsommationElec findByIdConsommateur(int idConsommateur) {
		return this.ConsommationElecDAO.findByIdConsommateur(idConsommateur);
	}

	@Override
	public void addConsommationElec(ConsommationElec ConsommationElec) {
		this.ConsommationElecDAO.save(ConsommationElec);

	}

	@Override
	public void deleteConsommationElec(ConsommationElec ConsommationElec) {
		this.ConsommationElecDAO.delete(ConsommationElec);

	}

	@Override
	public void updateConsommationElec(ConsommationElec ConsommationElec) {
		this.ConsommationElecDAO.save(ConsommationElec);

	}

}
