package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationElecDAO;
import com.entity.ConsommationElec;

@Service
public class ConsommationElecServiceImpl implements IConsommationElecService {

	@Autowired
	ConsommationElecDAO ConsommationElecDAO;

	@Override
	public List<ConsommationElec> getAllConsommationsElec() {
		return this.ConsommationElecDAO.findAll();
	}

	@Override
	public List<ConsommationElec> findByPieces(int idpiece) {
		return this.ConsommationElecDAO.findByPieces(idpiece);
	}

	@Override
	public ConsommationElec findByInstal(int idinstal) {
		return this.ConsommationElecDAO.findByInstal(idinstal);
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
