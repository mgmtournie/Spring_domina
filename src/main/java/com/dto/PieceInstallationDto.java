package com.dto;

import java.util.List;

import com.entity.Installation;
import com.entity.Piece;

public class PieceInstallationDto {
	private Piece piece;
	private List<Installation> listInst;

	public PieceInstallationDto() {
	}

	public PieceInstallationDto(Piece piece, List<Installation> listInst) {
		super();
		this.piece = piece;
		this.listInst = listInst;
	}

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public List<Installation> getListInst() {
		return listInst;
	}

	public void setListInst(List<Installation> listInst) {
		this.listInst = listInst;
	}

}
