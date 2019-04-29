package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalVolet;

@Repository
public interface InstalVoletDAO extends JpaRepository<InstalVolet, Double> {
	
	public List<InstalVolet> findByType(String type);

	public List<InstalVolet> findByPiece(int idpiece);

	public InstalVolet findById(int idInstall);

	public List<InstalVolet> findByProgrammes(int idprog);

	public List<InstalVolet> findByEtat(boolean etat);

}
