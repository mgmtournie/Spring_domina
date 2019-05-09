package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ProgrammeDAO;
import com.entity.Piece;
import com.entity.Programme;

@Service
public class ProgammeServiceImpl implements IProgrammeService {

	@Autowired
	ProgrammeDAO programmeDAO;

	public List<Programme> getAllProgrammes() {
		return this.programmeDAO.findAll();
	}

	public void addProgramme(Programme programme) {
		this.programmeDAO.save(programme);
	}

	public void updateProgramme(Programme programme) {
		this.programmeDAO.save(programme);
	}

	public void deleteProgramme(Programme programme) {
		this.programmeDAO.delete(programme);
	}

	public Programme findByIdProg(int idProgramme) {
		return this.programmeDAO.findByIdProg(idProgramme);
	}

	public Programme findByNomProg(String nomProg) {
		return this.programmeDAO.findByNomProg(nomProg);
	}
	
	public List<Programme> findByPiece(Piece piece) {
		return this.programmeDAO.findByPiece(piece);
	}
}
