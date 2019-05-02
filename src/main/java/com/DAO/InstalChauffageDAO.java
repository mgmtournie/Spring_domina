package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalChauffage;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstalChauffageDAO extends JpaRepository<InstalChauffage, Double> {

	public List<InstalChauffage> findByPiece(Piece piece);

	public InstalChauffage findById(int idInstall);

	public List<InstalChauffage> findByProgrammes (List<Programme> programmes );

	public List<InstalChauffage> findByEtat(boolean etat);

}
