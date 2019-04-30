package com.service;

import java.util.List;

import com.entity.Personne;

public interface IPersonneService {

	public List<Personne> getAllPersonnes();

	public void addPersonne(Personne personne);

	public void updatePersonne(Personne personne);

	public void deletePersonne(Personne personne);

	public Personne findByUsername(String username);

	public Personne findByNom(String nom);

	public Personne findByIdUser(int idUser);
}
