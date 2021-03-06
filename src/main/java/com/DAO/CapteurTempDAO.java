package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CapteurTemp;
import com.entity.Piece;

@Repository
public interface CapteurTempDAO extends JpaRepository<CapteurTemp, Integer> {

	public CapteurTemp findByIdCapteur(int idCapteur);

	public List<CapteurTemp> findByPiece(Piece piece);

}
