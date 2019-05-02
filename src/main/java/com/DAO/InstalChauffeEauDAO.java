package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalChauffeEau;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstalChauffeEauDAO extends JpaRepository<InstalChauffeEau, Double> {

	public List<InstalChauffeEau> findByPiece(Piece piece);

	public InstalChauffeEau findById(int idInstall);

	public List<InstalChauffeEau> findByProgrammes (List<Programme> programme);

	public List<InstalChauffeEau> findByEtat(boolean etat);
}
