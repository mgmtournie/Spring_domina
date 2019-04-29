package com.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.entity.Piece;

@Repository
public interface PieceDAO extends JpaRepository<Piece, Integer> {

	public Piece findByIdPiece(int idPiece);

	public Piece findByNomPiece(String nomPiece);

}
