package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalVolet;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstalVoletDAO extends JpaRepository<InstalVolet, Double> {

	public List<InstalVolet> findByPiece(Piece piece);

	public InstalVolet findById(int idInstall);

	public List<InstalVolet> findByProgrammes(List<Programme> programmes);

	public List<InstalVolet> findByEtat(boolean etat);

}
