package com.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.InstalVMC;

@Repository
public interface InstalVMCDAO extends JpaRepository<InstalVMC, Double> {

	public List<InstalVMC> findByPiece(int idpiece);

	public InstalVMC findById(int idInstall);

	public List<InstalVMC> findByProgrammes(int idprog);

	public List<InstalVMC> findByEtat(boolean etat);

}
