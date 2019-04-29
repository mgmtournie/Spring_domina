package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalEclairage;

@Repository
public interface InstalEclairageDAO extends JpaRepository<InstalEclairage, Double>{

	public List<InstalEclairage> findByType(String type);

	public List<InstalEclairage> findByPiece(int idpiece);

	public InstalEclairage findById(int idInstall);

	public List<InstalEclairage> findByProgrammes(int idprog);

	public List<InstalEclairage> findByEtat(boolean etat);
}
