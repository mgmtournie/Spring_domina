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

import com.entity.CapteurHumidite;
import com.entity.Piece;
import com.service.ICapteurHumiditeService;
import com.service.IPieceService;

@RestController
@RequestMapping("/capteur/Humidite")
@CrossOrigin(origins = "http://localhost:4200")
public class CapteurHumiditeController {

	@Autowired
	ICapteurHumiditeService capteurHumiditeService;
	
	@Autowired
	IPieceService pieceService;

	@GetMapping(value = "/all")
	public List<CapteurHumidite> getAllCapteursHumidite() {
		return this.capteurHumiditeService.getAllCapteursHumidite();
	}

	@GetMapping(value = "/ID/{id}")
	public CapteurHumidite findByIdCapteur(@PathVariable int id) {
		return this.capteurHumiditeService.findByIdCapteur(id);
	}

	@GetMapping(value = "/Piece/{idPiece}")
	public List<CapteurHumidite> findByPiece(@PathVariable int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return this.capteurHumiditeService.findByPiece(piece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurHumidite(CapteurHumidite capteurHumidite) {
		this.capteurHumiditeService.addCapteurHumidite(capteurHumidite);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurHumidite(@RequestBody CapteurHumidite capteurHumidite, @PathVariable int idCapteur) {
		if (capteurHumiditeService.findByIdCapteur(idCapteur) != null) {
			capteurHumiditeService.addCapteurHumidite(capteurHumidite);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteurHumidite(@PathVariable int idCapteur) {
		if (capteurHumiditeService.findByIdCapteur(idCapteur) != null) {
			capteurHumiditeService.deleteCapteurHumidite(capteurHumiditeService.findByIdCapteur(idCapteur));
		}
	}

}
