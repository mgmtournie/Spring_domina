package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalVMC;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstalVMCDAO extends JpaRepository<InstalVMC, Double> {

	public List<InstalVMC> findByPiece(Piece piece);

	public InstalVMC findById(int idInstall);

	public List<InstalVMC> findByProgrammes(List<Programme> programmes);

	public List<InstalVMC> findByEtat(boolean etat);

}
