package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CapteurCO2;
import com.entity.Piece;

@Repository
public interface CapteurCO2DAO extends JpaRepository<CapteurCO2, Integer> {

	public CapteurCO2 findByIdCapteur(int id);

	public List<CapteurCO2> findByPiece(Piece piece);

}
