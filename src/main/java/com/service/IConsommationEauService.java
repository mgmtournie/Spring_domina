package com.service;

import java.util.List;

import com.entity.ConsommationEau;
import com.entity.Installation;
import com.entity.Piece;

public interface IConsommationEauService {

	public List<ConsommationEau> getAllConsommationsEau();

	public List<ConsommationEau> findByPiece(Piece piece);

	public ConsommationEau findByInstal(Installation instal);

	public ConsommationEau findByIdConsommateur(int idConsommateur);

	public void addConsommationEau(ConsommationEau ConsommationEau);

	public void deleteConsommationEau(ConsommationEau ConsommationEau);

	public void updateConsommationEau(ConsommationEau ConsommationEau);
}
