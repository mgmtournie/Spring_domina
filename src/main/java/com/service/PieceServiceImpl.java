package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.PieceDAO;
import com.entity.Piece;

@Service
public class PieceServiceImpl implements IPieceService {

	@Autowired
	PieceDAO pieceDAO;

	public List<Piece> getAllPieces() {
		return this.pieceDAO.findAll();
	}

	public void addPiece(Piece piece) {
		this.pieceDAO.save(piece);
	}

	public void updatePiece(Piece piece) {
		this.pieceDAO.save(piece);
	}

	public void deletePiece(Piece piece) {
		this.pieceDAO.delete(piece);
	}

	public Piece findByIdPiece(int idPiece) {
		return this.pieceDAO.findByIdPiece(idPiece);

	}

	public Piece findByNomPiece(String nom) {
		return this.pieceDAO.findByNomPiece(nom);
	}

}
