package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationElec;
import com.entity.Installation;
import com.entity.Piece;

@Repository
public interface ConsommationElecDAO extends JpaRepository<ConsommationElec, Integer> {

	public ConsommationElec findByIdConsommateur(int idConso);

	public List<ConsommationElec> findByPiece(Piece piece);

	public ConsommationElec findByInstal(Installation instal);

}
