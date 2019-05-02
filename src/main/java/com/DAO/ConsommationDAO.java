package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Consommation;
import com.entity.Installation;
import com.entity.Piece;

@Repository
public interface ConsommationDAO extends JpaRepository<Consommation, Integer> {

	public Consommation findByIdConsommateur(int idConso);

	public List<Consommation> findByPiece(Piece piece);

	public Consommation findByInstal(Installation instal);

	public List<Consommation> findByType(String type);

}
