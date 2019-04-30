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

import com.entity.Consommation;
import com.service.IConsommationService;

@RestController
@RequestMapping("/conso")
@CrossOrigin(origins = "http://localhost:8034")
public class ConsommationController {

	@Autowired
	IConsommationService consommationService;
	//postman ok
	@GetMapping(value = "/all")
	public List<Consommation> getAllConsommations() {
		return consommationService.getAllConsommations();
	}

	@GetMapping(value = "/Piece/{idpiece}")
	public List<Consommation> findByPieces(@PathVariable int idpiece) {
		return consommationService.findByPieces(idpiece);
	}

	@GetMapping(value = "/Instal/{idinstal}")
	public Consommation findByInstal(@PathVariable int idinstal) {
		return consommationService.findByInstal(idinstal);

	}

	@GetMapping(value = "/ID/{idConsommateur}")
	public Consommation findByIdConsommateur(@PathVariable int idConsommateur) {
		return consommationService.findByIdConsommateur(idConsommateur);
	}

	@PostMapping(value = "/addConso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addConsommation(Consommation consommation) {
		this.consommationService.addConsommation(consommation);

	}

	@DeleteMapping(value = "/{idCons}")
	public void deleteConsommation(@PathVariable int idCons) {
		if (consommationService.findByIdConsommateur(idCons) != null) {
			consommationService.deleteConsommation(consommationService.findByIdConsommateur(idCons));
		}
	}

	@PutMapping("/{idCons}")
	public void updateConsommation(@RequestBody Consommation consommation, @PathVariable int idCons) {
		if (consommationService.findByIdConsommateur(idCons) != null) {
			consommationService.addConsommation(consommation);
		}

	}

}
