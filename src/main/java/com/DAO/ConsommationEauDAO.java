package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationEau;
import com.entity.Installation;
import com.entity.Piece;

@Repository
public interface ConsommationEauDAO extends JpaRepository<ConsommationEau, Integer> {

	public ConsommationEau findByIdConsommateur(int idConso);

	public List<ConsommationEau> findByPiece(Piece piece);

	public ConsommationEau findByInstal(Installation instal);

}
