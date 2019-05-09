package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface ProgrammeDAO extends JpaRepository<Programme, Integer> {

	public Programme findByIdProg(int idProgramme);

	public Programme findByNomProg(String nomProg);
	
	public List<Programme> findByPiece(Piece piece);

}