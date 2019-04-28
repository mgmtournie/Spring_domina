package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CapteurCO2;

@Repository
public interface CapteurCO2SDAO extends JpaRepository<CapteurCO2, Integer> {
	

	public CapteurCO2 findByIdCapteur(int idCapteur);

	public List<CapteurCO2> findByPiece(int idPiece);

	public List<CapteurCO2> findByType(String type);

}
