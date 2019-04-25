package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.PersonneDAO;
import com.entity.Personne;
import com.entity.Programme;

@Service
public class PersonneServiceImpl implements IPersonneService {

	@Autowired
	PersonneDAO personneDAO;

	public PersonneServiceImpl(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	public List<Personne> getAllPersonnes() {
		return null;
	}

	public void addPersonne(Personne personne) {

	}

	public void updatePersonne(Personne personne) {

	}

	public void deletePersonne(Personne personne) {

	}

	public Personne findByUsername(String username) {
		return null;

	}

	public Personne findByNom(String nom) {
		return null;

	}

	public String verifierConsomation(int idconsomation) {
		return null;

	}

	public void lancerProgramme(int idProgramme) {

	}

	public void creerProgramme(Programme programme) {

	}

	public void arreterProgramme(int idProgramme) {

	}

	public void consulterCatpeur(int idCapteur) {

	}
}
