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

import com.entity.ConsommationChauffage;
import com.entity.Installation;
import com.entity.Piece;
import com.service.IConsommationChauffageService;
import com.service.IInstallationService;
import com.service.IPieceService;

@RestController
@RequestMapping("/conso/Chauffage")
@CrossOrigin(origins = "http://localhost:4200")
public class ConsommationChauffageController {

	@Autowired
	IConsommationChauffageService ConsommationChauffageService;
	@Autowired
	IPieceService pieceService;
	@Autowired
	IInstallationService instalService;
	
//postman ok
	@GetMapping(value = "/all")
	public List<ConsommationChauffage> getAllConsommationsChauffage() {
		return ConsommationChauffageService.getAllConsommationsChauffage();
	}

	@GetMapping(value = "/Piece/{idPiece}")
	public List<ConsommationChauffage> findByPieces(@PathVariable int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return ConsommationChauffageService.findByPiece(piece);
	}

	@GetMapping(value = "/ID/{idInstal}")
	public ConsommationChauffage findByInstal(@PathVariable int idInstal) {
		Installation instal = new Installation();
		instal = instalService.findById(idInstal);
		return ConsommationChauffageService.findByInstal(instal);

	}

	@GetMapping(value = "/IDConso/{idConsommateur}")
	public ConsommationChauffage findByIdConsommateur(@PathVariable int idConsommateur) {
		return ConsommationChauffageService.findByIdConsommateur(idConsommateur);
	}

	@PostMapping(value = "/addConso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addConsommationChauffage(ConsommationChauffage ConsommationChauffage) {
		this.ConsommationChauffageService.addConsommationChauffage(ConsommationChauffage);

	}

	@DeleteMapping(value = "/{idCons}")
	public void deleteConsommationChauffage(@PathVariable int idCons) {
		if (ConsommationChauffageService.findByIdConsommateur(idCons) != null) {
			ConsommationChauffageService
					.deleteConsommationChauffage(ConsommationChauffageService.findByIdConsommateur(idCons));
		}
	}

	@PutMapping("/{idCons}")
	public void updateConsommationChauffage(@RequestBody ConsommationChauffage ConsommationChauffage,
			@PathVariable int idCons) {
		if (ConsommationChauffageService.findByIdConsommateur(idCons) != null) {
			ConsommationChauffageService.addConsommationChauffage(ConsommationChauffage);
		}

	}

}
