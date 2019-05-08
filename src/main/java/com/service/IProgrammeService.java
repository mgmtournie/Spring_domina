package com.service;

import java.util.List;

import com.entity.Piece;
import com.entity.Programme;

public interface IProgrammeService {

	public List<Programme> getAllProgrammes();

	public void addProgramme(Programme programme);

	public void updateProgramme(Programme programme);

	public void deleteProgramme(Programme programme);

	public Programme findByIdProg(int idProgramme);

	public Programme findByNomProg(String nomProg);
	
	public List<Programme> findByPiece(Piece piece);

}
