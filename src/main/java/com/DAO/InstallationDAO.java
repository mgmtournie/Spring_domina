package com.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.Installation;

@Repository
public interface InstallationDAO {
	public List<Installation> foundByType(int type);
	
	public List<Installation> foundByPiece(int idPiece);
	
	public Installation foundById(int idInstall); 

}
