package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationChauffage;

@Repository
public interface ConsommationChauffageDAO extends JpaRepository<ConsommationChauffage, Integer> {

	public ConsommationChauffage findByIdConsommateur(int idConso);

	public List<ConsommationChauffage> findByPieces(int idPiece);

	public ConsommationChauffage findByInstal(int idinstal);

}
