package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationChauffageDAO;
import com.entity.ConsommationChauffage;

@Service
public class ConsommationChauffageServiceImpl implements IConsommationChauffageService {

	@Autowired
	ConsommationChauffageDAO ConsommationChauffageDAO;

	@Override
	public List<ConsommationChauffage> getAllConsommationChauffages() {
		return this.ConsommationChauffageDAO.findAll();
	}

	@Override
	public List<ConsommationChauffage> findByPieces(int idpiece) {
		return this.ConsommationChauffageDAO.findByPieces(idpiece);
	}

	@Override
	public ConsommationChauffage findByInstal(int idinstal) {
		return this.ConsommationChauffageDAO.findByInstal(idinstal);
	}

	@Override
	public ConsommationChauffage findByIdConsommateur(int idConsommateur) {
		return this.ConsommationChauffageDAO.findByIdConsommateur(idConsommateur);
	}

	@Override
	public void addConsommationChauffage(ConsommationChauffage ConsommationChauffage) {
		this.ConsommationChauffageDAO.save(ConsommationChauffage);
		
	}

	@Override
	public void deleteConsommationChauffage(ConsommationChauffage ConsommationChauffage) {
		this.ConsommationChauffageDAO.delete(ConsommationChauffage);
		
	}

	@Override
	public void updateConsommationChauffage(ConsommationChauffage ConsommationChauffage) {
		this.ConsommationChauffageDAO.save(ConsommationChauffage);
		
	}

}
