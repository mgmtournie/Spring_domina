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

import com.entity.ConsommationEau;
import com.service.IConsommationEauService;

@RestController
@RequestMapping("/conso/Eau")
@CrossOrigin(origins = "http://localhost:8034")
public class ConsommationEauController {

	@Autowired
	IConsommationEauService ConsommationEauService;

	@GetMapping(value = "/all")
	public List<ConsommationEau> getAllConsommationsEau() {
		return ConsommationEauService.getAllConsommationsEau();
	}

	@GetMapping(value = "/Piece/{idpiece}")
	public List<ConsommationEau> findByPieces(@PathVariable int idpiece) {
		return ConsommationEauService.findByPieces(idpiece);
	}

	@GetMapping(value = "/Instal/{idinstal}")
	public ConsommationEau findByInstal(@PathVariable int idinstal) {
		return ConsommationEauService.findByInstal(idinstal);

	}

	@GetMapping(value = "/ID/{idConsommateur}")
	public ConsommationEau findByIdConsommateur(@PathVariable int idConsommateur) {
		return ConsommationEauService.findByIdConsommateur(idConsommateur);
	}

	@PostMapping(value = "/addConso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addConsommationEau(ConsommationEau ConsommationEau) {
		this.ConsommationEauService.addConsommationEau(ConsommationEau);

	}

	@DeleteMapping(value = "/{idCons}")
	public void deleteConsommationEau(@PathVariable int idCons) {
		if (ConsommationEauService.findByIdConsommateur(idCons) != null) {
			ConsommationEauService.deleteConsommationEau(ConsommationEauService.findByIdConsommateur(idCons));
		}
	}

	@PutMapping("/{idCons}")
	public void updateConsommationEau(@RequestBody ConsommationEau ConsommationEau, @PathVariable int idCons) {
		if (ConsommationEauService.findByIdConsommateur(idCons) != null) {
			ConsommationEauService.addConsommationEau(ConsommationEau);
		}

	}

}
