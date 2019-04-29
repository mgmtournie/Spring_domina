package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationEau;

@Repository
public interface ConsommationEauDAO extends JpaRepository<ConsommationEau, Integer> {

	public ConsommationEau findByIdConsommateur(int idConso);

	public List<ConsommationEau> findByPieces(int idPiece);

	public ConsommationEau findByInstal(int idinstal);

}
