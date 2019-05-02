package com.service;

import java.util.List;

import com.entity.ConsommationElec;
import com.entity.Installation;
import com.entity.Piece;

public interface IConsommationElecService {

	public List<ConsommationElec> getAllConsommationsElec();

	public List<ConsommationElec> findByPiece(Piece piece);

	public ConsommationElec findByInstal(Installation instal);

	public ConsommationElec findByIdConsommateur(int idConsommateur);

	public void addConsommationElec(ConsommationElec ConsommationElec);

	public void deleteConsommationElec(ConsommationElec ConsommationElec);

	public void updateConsommationElec(ConsommationElec ConsommationElec);
}
