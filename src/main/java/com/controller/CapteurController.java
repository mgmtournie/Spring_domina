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

import com.entity.Capteur;
import com.entity.Piece;
import com.service.ICapteurService;
import com.service.IPieceService;

@RestController
@RequestMapping("/capteur")
@CrossOrigin(origins = "http://localhost:4200")
public class CapteurController {

	@Autowired
	ICapteurService capteurService;
	
	@Autowired
	IPieceService pieceService;

	@GetMapping(value = "/all")
	public List<Capteur> getAllCapteurs() {
		return capteurService.getAllCapteurs();
	}

	@GetMapping(value = "/ID/{id}")
	public Capteur findByIdCapteur(@PathVariable int id) {
		return capteurService.findByIdCapteur(id);
	}

	@GetMapping(value = "/Type/{type}")
	public List<Capteur> findByType(@PathVariable String type) {
		return capteurService.findByType(type);
	}

	@GetMapping(value = "/Piece/{idPiece}")
	public List<Capteur> findByPiece(@PathVariable int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return capteurService.findByPiece(piece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteur(Capteur capteur) {
		this.capteurService.addCapteur(capteur);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteur(@RequestBody Capteur capteur, @PathVariable int idCapteur) {
		if (capteurService.findByIdCapteur(idCapteur) != null) {
			capteurService.addCapteur(capteur);
		}
		
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteur(@PathVariable int idCapteur) {
		if (capteurService.findByIdCapteur(idCapteur) != null) {
			capteurService.deleteCapteur(capteurService.findByIdCapteur(idCapteur));
		}
	}

}
