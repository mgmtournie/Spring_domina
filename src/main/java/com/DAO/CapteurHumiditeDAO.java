package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CapteurHumidite;
import com.entity.Piece;

@Repository
public interface CapteurHumiditeDAO extends JpaRepository<CapteurHumidite, Integer> {

	public CapteurHumidite findByIdCapteur(int idCapteur);

	public List<CapteurHumidite> findByPiece(Piece piece);

}
