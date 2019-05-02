package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ConsommationChauffage;
import com.entity.Installation;
import com.entity.Piece;

@Repository
public interface ConsommationChauffageDAO extends JpaRepository<ConsommationChauffage, Integer> {

	public ConsommationChauffage findByIdConsommateur(int idConso);

	public List<ConsommationChauffage> findByPiece(Piece piece);

	public ConsommationChauffage findByInstal(Installation instal);

}
