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

import com.entity.CapteurCO2;
import com.entity.Piece;
import com.service.ICapteurCO2Service;
import com.service.IPieceService;

@RestController
@RequestMapping("/capteur/CO2")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurCO2Controller {

	@Autowired
	ICapteurCO2Service capteurCO2Service;
	
	@Autowired
	IPieceService pieceService;
//test postman ok
	@GetMapping(value = "/all")
	public List<CapteurCO2> getAllCapteursCO2() {
		return this.capteurCO2Service.getAllCapteursCO2();
	}
//test postman ok
	@GetMapping(value = "/ID/{idCapteur}")
	public CapteurCO2 findByIdCapteur(@PathVariable int idCapteur) {
		return this.capteurCO2Service.findByIdCapteur(idCapteur);
	}
//Postman ok youpiiii
	@GetMapping(value = "/Piece/{idPiece}")
	public List<CapteurCO2> findByPiece(@PathVariable int idPiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idPiece);
		return this.capteurCO2Service.findByPiece(piece);
	}
//postman ok
	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurCO2(CapteurCO2 capteurCO2) {
		this.capteurCO2Service.addCapteurCO2(capteurCO2);
	}
//postman ok
	@PutMapping(value = "/{idCapteur}")
	public void updateCapteurCO2(@RequestBody CapteurCO2 capteurCO2, @PathVariable int idCapteur) {
		if (capteurCO2Service.findByIdCapteur(idCapteur) != null) {
			capteurCO2Service.addCapteurCO2(capteurCO2);
		}
	}
//postman ok
	@DeleteMapping("/{idCapteur}")
	public void deleteCapteurCO2(@PathVariable int idCapteur) {
		if (capteurCO2Service.findByIdCapteur(idCapteur) != null) {
			capteurCO2Service.deleteCapteurCO2(capteurCO2Service.findByIdCapteur(idCapteur));
		}
	}

}
