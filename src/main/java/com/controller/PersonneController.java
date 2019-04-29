package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Personne;
import com.service.IPersonneService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:8034")
public class PersonneController {

	@Autowired
	IPersonneService personneService;

	@GetMapping(value = "/all")
	public List<Personne> getAllPersonnes() {
		return personneService.getAllPersonnes();
	}

	@GetMapping(value = "/User/{username}")
	public Personne findByUsername(@PathVariable String username) {
		return personneService.findByUsername(username);
	}

	@GetMapping(value = "/nom/{nom}")
	public Personne findByNom(@PathVariable String nom) {
		return personneService.findByNom(nom);
	}

	@PostMapping(value = "/adduser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPersonne(@RequestBody Personne personne) {
		this.personneService.addPersonne(personne);
	}

	@PutMapping("/{idUser}")
	public void updatePersonne(@RequestBody Personne personne, @PathVariable int idUser) {
		if (personneService.findByIdUser(idUser) != null) {
			personneService.addPersonne(personne);
		}
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable int id) {
		if (personneService.findByIdUser(id) != null) {
			personneService.deletePersonne(personneService.findByIdUser(id));
		}
	}

}
