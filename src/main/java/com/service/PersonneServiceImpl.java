package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.ConsommationDAO;
import com.DAO.PersonneDAO;
import com.entity.Consommation;
import com.entity.Personne;
import com.entity.Programme;

@Service
public class PersonneServiceImpl implements IPersonneService {

	@Autowired
	PersonneDAO personneDAO;
	@Autowired
	ConsommationDAO consommationDAO;
	
	

	public PersonneServiceImpl(PersonneDAO personneDAO) {
		this.personneDAO = personneDAO;
	}

	public List<Personne> getAllPersonnes() {
		return this.personneDAO.findAll();
	}

	public void addPersonne(Personne personne) {
		this.personneDAO.save(personne);
	}

	public void updatePersonne(Personne personne) {
		this.personneDAO.save(personne);
	}

	public void deletePersonne(Personne personne) {
		this.personneDAO.delete(personne);
	}

	public Personne findByUsername(String username) {
		return this.personneDAO.findByUsername(username);

	}
	public Personne findByIdUser(int idUser) {
		return this.personneDAO.findByIdUser(idUser);
	}
	public Personne findByNom(String nom) {
		return this.personneDAO.findByNom(nom);

	}
}
