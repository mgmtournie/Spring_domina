package com.service;

import java.util.List;

import com.entity.ConsommationEau;

public interface IConsommationEauService {

	public List<ConsommationEau> getAllConsommationEaus();

	public List<ConsommationEau> findByPieces(int idpiece);

	public ConsommationEau findByInstal(int idinstal);

	public ConsommationEau findByIdConsommateur(int idConsommateur);

	public void addConsommationEau(ConsommationEau ConsommationEau);

	public void deleteConsommationEau(ConsommationEau ConsommationEau);

	public void updateConsommationEau(ConsommationEau ConsommationEau);
}
