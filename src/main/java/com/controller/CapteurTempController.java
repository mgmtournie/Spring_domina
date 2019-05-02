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

import com.entity.CapteurTemp;
import com.entity.Piece;
import com.service.ICapteurTempService;
import com.service.IPieceService;

@RestController
@RequestMapping("/capteur/Temp")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurTempController {

	@Autowired
	ICapteurTempService capteurTempService;
	
	@Autowired
	IPieceService pieceService;
//postman ok
	@GetMapping(value = "/all")
	public List<CapteurTemp> getAllCapteursTemp() {
		return this.capteurTempService.getAllCapteursTemp();
	}
//postman ok
	@GetMapping(value = "/ID/{id}")
	public CapteurTemp findByIdCapteur(@PathVariable int id) {
		return this.capteurTempService.findByIdCapteur(id);
	}

	@GetMapping(value = "/Piece/{idPiece}")
	public List<CapteurTemp> findByPiece(@PathVariable int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return this.capteurTempService.findByPiece(piece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurTemp(CapteurTemp capteurTemp) {
		this.capteurTempService.addCapteurTemp(capteurTemp);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurTemp(@RequestBody CapteurTemp capteurTemp, @PathVariable int idCapteur) {
		if (capteurTempService.findByIdCapteur(idCapteur) != null) {
			capteurTempService.addCapteurTemp(capteurTemp);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteurTemp(@PathVariable int idCapteur) {
		if (capteurTempService.findByIdCapteur(idCapteur) != null) {
			capteurTempService.deleteCapteurTemp(capteurTempService.findByIdCapteur(idCapteur));
		}
	}

}
