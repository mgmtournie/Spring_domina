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

import com.entity.CapteurLumen;
import com.entity.Piece;
import com.service.ICapteurLumenService;
import com.service.IPieceService;

@RestController
@RequestMapping("/capteur/Lumen")
@CrossOrigin(origins = "http://localhost:4200")
public class CapteurLumenController {

	@Autowired
	ICapteurLumenService capteurLumenService;
	
	@Autowired
	IPieceService pieceService;
	//postman ok
	@GetMapping(value = "/all")
	public List<CapteurLumen> getAllCapteursLumen() {
		return this.capteurLumenService.getAllCapteursLumen();
	}
	//postman ok
	@GetMapping(value = "/ID/{id}")
	public CapteurLumen findByIdCapteurLumen(@PathVariable int id) {
		return this.capteurLumenService.findByIdCapteur(id);
	}

	@GetMapping(value = "/Piece/{idPiece}")
	public List<CapteurLumen> findByPiece(int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return this.capteurLumenService.findByPiece(piece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurLumen(CapteurLumen capteurLumen) {
		this.capteurLumenService.addCapteurLumen(capteurLumen);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurLumen(@RequestBody CapteurLumen capteurLumen, @PathVariable int idCapteur) {
		if (capteurLumenService.findByIdCapteur(idCapteur) != null) {
			capteurLumenService.addCapteurLumen(capteurLumen);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteurLumen(@PathVariable int idCapteur) {
		if (capteurLumenService.findByIdCapteur(idCapteur) != null) {
			capteurLumenService.deleteCapteurLumen(capteurLumenService.findByIdCapteur(idCapteur));
		}
	}

}
