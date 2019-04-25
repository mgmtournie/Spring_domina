package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.PersonneDAO;
import com.entity.Personne;
import com.entity.Programme;

@Service
public class PersonneService {

	@Autowired
	PersonneDAO personneDAO;

	public List<Personne> getAllPersonnes() {
		return this.personneDAO.findAll();
	}

	public Personne addPersonne(Personne personne) {
		return this.personneDAO.save(personne);
	}

	public void updatePersonne(Personne personne) {

	}

	public void deletePersonne(Personne personne) {

	}

	public Personne findByUsername(String username) {
		 return this.personneDAO.findByUsername(username);

	}

	public void findByNom(String nom) {

	}

	public String verifierConsomation(int idconsomation) {
		return null;

	}

	public void lancerProgramme(int idProgramme) {

	}

	public void creerProgramme(Programme programme) {

	}

	public void arrerterProgramme(int idProgramme) {

	}

	public void consulterCatpeur(int idCapteur) {

	}
}
