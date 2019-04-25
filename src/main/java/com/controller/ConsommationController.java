package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

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

	@GetMapping(value = "/all")
	public List<Consommation> getAllConsommations() {
		return consommationService.getAllConsommations();
	}
	@GetMapping(value = "/{type}")
	public List<Consommation> findByType(String type) {
		return consommationService.findByType(type);
	}
	@GetMapping(value = "/{idpiece}")
	public List<Consommation> findByPieces(int idpiece) {
		return consommationService.findByPieces(idpiece); 
	}
	@GetMapping(value = "/{idinstal}")
	public Consommation findByInstal(int idinstal) {
		return consommationService.findByInstal(idinstal);

	}
	@GetMapping(value = "/{idConsommateur}")
	public List<Consommation> findByIdConsommateur(int idConsommateur) {
		return consommationService.findByIdConsommateur(idConsommateur);
	}

}
