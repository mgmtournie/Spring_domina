package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Installation;
import com.entity.Piece;
import com.entity.Programme;

@Repository
public interface InstallationDAO extends JpaRepository<Installation, Double> {

	public List<Installation> findByType(String type);

	public List<Installation> findByPiece(Piece piece);

	public Installation findById(int idInstall);

	public List<Installation> findByProgrammes(List<Programme> programmes);

	public List<Installation> findByEtat(boolean etat);

}
