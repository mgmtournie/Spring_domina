package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CapteurLumen;
import com.entity.Piece;

@Repository
public interface CapteurLumenDAO extends JpaRepository<CapteurLumen, Integer> {

	public CapteurLumen findByIdCapteur(int idCapteur);

	public List<CapteurLumen> findByPiece(Piece piece);

}
