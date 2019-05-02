package com.service;

import java.util.List;

import com.entity.ConsommationChauffage;
import com.entity.Installation;
import com.entity.Piece;

public interface IConsommationChauffageService {

	public List<ConsommationChauffage> getAllConsommationsChauffage();

	public List<ConsommationChauffage> findByPiece(Piece piece);

	public ConsommationChauffage findByInstal(Installation instal);

	public ConsommationChauffage findByIdConsommateur(int idConsommateur);

	public void addConsommationChauffage(ConsommationChauffage ConsommationChauffage);

	public void deleteConsommationChauffage(ConsommationChauffage ConsommationChauffage);

	public void updateConsommationChauffage(ConsommationChauffage ConsommationChauffage);

}
