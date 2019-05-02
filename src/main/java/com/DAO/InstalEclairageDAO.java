package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalEclairage;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstalEclairageDAO extends JpaRepository<InstalEclairage, Double> {

	public List<InstalEclairage> findByPiece(Piece idpiece);

	public InstalEclairage findById(int idInstall);

	public List<InstalEclairage> findByProgrammes(List<Programme> programmes);

	public List<InstalEclairage> findByEtat(boolean etat);
}
