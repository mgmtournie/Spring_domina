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
import com.entity.Installation;
import com.entity.Piece;
import com.service.IConsommationEauService;
import com.service.IInstallationService;
import com.service.IPieceService;

@RestController
@RequestMapping("/conso/Eau")
@CrossOrigin(origins = "http://localhost:8034")
public class ConsommationEauController {

	@Autowired
	IConsommationEauService ConsommationEauService;
	
	@Autowired
	IPieceService pieceService;
	
	@Autowired
	IInstallationService instalService;
	
	//postman ok
	@GetMapping(value = "/all")
	public List<ConsommationEau> getAllConsommationsEau() {
		return ConsommationEauService.getAllConsommationsEau();
	}

	@GetMapping(value = "/Piece/{idpiece}")
	public List<ConsommationEau> findByPiece(@PathVariable int idpiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idpiece);
		return ConsommationEauService.findByPiece(piece);
	}

	@GetMapping(value = "/Instal/{idinstal}")
	public ConsommationEau findByInstal(@PathVariable int idinstal) {
		Installation instal = new Installation();
		instal = instalService.findById(idinstal);
		return ConsommationEauService.findByInstal(instal);

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
