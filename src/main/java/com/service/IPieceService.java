package com.service;

import java.util.List;

import com.entity.Installation;
import com.entity.Piece;

public interface IPieceService {

	public List<Piece> getAllPieces();

	public void addPiece(Piece piece);

	public void updatePiece(Piece piece);

	public void deletePiece(Piece piece);

	public Piece findByIdPiece(int idPiece);

	public Piece findByNomPiece(String nom);

	public void updatePieceWithInstallations(Piece piece, List<Installation> listInst);
}
