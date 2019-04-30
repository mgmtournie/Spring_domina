package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalChauffage;

@Repository
public interface InstalChauffageDAO extends JpaRepository<InstalChauffage, Double> {

	public List<InstalChauffage> findByPiece(int idpiece);

	public InstalChauffage findById(int idInstall);

	public List<InstalChauffage> findByProgrammes(int idprog);

	public List<InstalChauffage> findByEtat(boolean etat);

}
