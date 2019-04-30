package com.service;

import java.util.List;

import com.entity.ConsommationElec;

public interface IConsommationElecService {

	public List<ConsommationElec> getAllConsommationsElec();

	public List<ConsommationElec> findByPieces(int idpiece);

	public ConsommationElec findByInstal(int idinstal);

	public ConsommationElec findByIdConsommateur(int idConsommateur);

	public void addConsommationElec(ConsommationElec ConsommationElec);

	public void deleteConsommationElec(ConsommationElec ConsommationElec);

	public void updateConsommationElec(ConsommationElec ConsommationElec);
}
