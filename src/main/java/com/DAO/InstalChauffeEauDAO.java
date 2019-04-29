package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalChauffeEau;

@Repository
public interface InstalChauffeEauDAO extends JpaRepository<InstalChauffeEau, Double> {

	public List<InstalChauffeEau> findByType(String type);

	public List<InstalChauffeEau> findByPiece(int idpiece);

	public InstalChauffeEau findById(int idInstall);

	public List<InstalChauffeEau> findByProgrammes(int idprog);

	public List<InstalChauffeEau> findByEtat(boolean etat);
}
