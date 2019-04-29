package com.service;

import java.util.List;

import com.entity.ConsommationChauffage;

public interface IConsommationChauffageService {

	public List<ConsommationChauffage> getAllConsommationChauffages();

	public List<ConsommationChauffage> findByPieces(int idpiece);

	public ConsommationChauffage findByInstal(int idinstal);

	public ConsommationChauffage findByIdConsommateur(int idConsommateur);

	public void addConsommationChauffage(ConsommationChauffage ConsommationChauffage);

	public void deleteConsommationChauffage(ConsommationChauffage ConsommationChauffage);

	public void updateConsommationChauffage(ConsommationChauffage ConsommationChauffage);

}
