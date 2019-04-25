package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping(value = "/{username}")
	public Personne findByUsername(@PathVariable String username) {
		return personneService.findByUsername(username);	
	}
	
	@GetMapping(value = "/{nom}")
	public Personne findByNom(@PathVariable String nom) {
		return personneService.findByNom(nom);
	}

//	@GetMapping(value = "/conso{idconsommation}")
//	public List<Consommation> verifierConsomation(@PathVariable int idconsomation){
//		return personneService.verifierConsomation(idconsomation);	
//	}
	
//	@GetMapping(value = "/capteur{idCapteur}")
//	public void consulterCapteur(@PathVariable int idCapteur){
//		return personneService.consulterCapteur(idCapteur);	
//	}
	
	@PostMapping(value = "/adduser", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPersonne(@RequestBody Personne personne) {
		this.personneService.addPersonne(personne);
	}
	
//	@PostMapping("/createProg")
//	public void creerProgramme(Programme programme){	
//	}

//	@PutMapping("/{idUser}")
//	public Personne updatePersonne(@RequestBody Personne personne, @PathVariable long idUser) {
//		if (personneService.findById(idUser) == null) {
//			return null;
//		}else{
//			return userService.addUser(user);
//		}}
//		
//	@PutMapping("/launchProg{idProgramme}")
//	public void lancerProgramme(@PathVariable int idProgramme){	
//	}
	
//	@PutMapping("/stopProg{idProgramme}")
//	public void lancerProgramme(@PathVariable int idProgramme){	
//	}

	
//	@DeleteMapping("/{id}")
//	public void deleteUser(@PathVariable long id) {
//	if(userService.getUserById(id)!=null){
//			userService.deleteUser(userService.getUserById(id));
//		}
//	}


	
}
