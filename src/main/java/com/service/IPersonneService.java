package com.service;

import java.util.List;

import com.entity.Personne;
import com.entity.Programme;

public interface IPersonneService {

	public List<Personne> getAllPersonnes();

	public void addPersonne(Personne personne);

	public void updatePersonne(Personne personne);

	public void deletePersonne(Personne personne);

	public Personne findByUsername(String username);

	public Personne findByNom(String nom);

	public String verifierConsomation(int idconsomation);

	public void lancerProgramme(int idProgramme);

	public void creerProgramme(Programme programme);

	public void arreterProgramme(int idProgramme);

	public void consulterCatpeur(int idCapteur);
}
