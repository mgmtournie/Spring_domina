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

	public List<Personne> getAllPersonnes() {
	return null; //this.personneDAO.findAll();
	}

	public void addPersonne(Personne personne) {
		//this.personneDAO.save(personne);
	}

	public void updatePersonne(Personne personne) {
		//this.personneDAO.save(personne);
	}

	public void deletePersonne(Personne personne) {
		//this.personneDAO.delete(personne);
	}

	public Personne findByUsername(String username) {
		return null; //this.personneDAO.findByUsername(username);

	}

	public Personne findByNom(String nom) {
		return null; //this.personneDAO.findByNom(nom);

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
