package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationChauffageDAO;
import com.entity.ConsommationChauffage;
import com.entity.Installation;
import com.entity.Piece;

@Service
public class ConsommationChauffageServiceImpl implements IConsommationChauffageService {

	@Autowired
	ConsommationChauffageDAO ConsommationChauffageDAO;

	@Override
	public List<ConsommationChauffage> getAllConsommationsChauffage() {
		return this.ConsommationChauffageDAO.findAll();
	}

	@Override
	public List<ConsommationChauffage> findByPiece(Piece piece) {
		return this.ConsommationChauffageDAO.findByPiece(piece);
	}

	@Override
	public ConsommationChauffage findByInstal(Installation instal) {
		return this.ConsommationChauffageDAO.findByInstal(instal);
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
