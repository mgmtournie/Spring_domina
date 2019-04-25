package com.service;

import java.util.List;

import com.entity.Programme;

public interface IProgrammeService {

	public List<Programme> getAllPersonnes();

	public void addProgramme(Programme programme);

	public void updateProgramme(Programme programme);

	public void deleteProgramme(Programme programme);

	public Programme findByIdProg(int idProgramme);

	public Programme findByNomProg(String nomProg);

}
