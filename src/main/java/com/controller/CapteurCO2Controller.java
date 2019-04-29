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
import com.service.ICapteurCO2Service;

@RestController
@RequestMapping("/capteur/CO2")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurCO2Controller {
	
	@Autowired
	ICapteurCO2Service capteurCO2Service; 
	
	@GetMapping(value= "/all")
	public List<CapteurCO2> getAllCapteursCO2() {
		return this.capteurCO2Service.getAllCapteursCO2();
	}

	@GetMapping(value= "/ID/{id}")
	public CapteurCO2 findByIdCapteurCO2(int id) {
		return this.capteurCO2Service.findByIdCapteurCO2(id);
	}

	@GetMapping(value= "/Piece/{idpiece}")
	public List<CapteurCO2> findByPiece(int idPiece) {
		return this.capteurCO2Service.findByPiece(idPiece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurCO2(CapteurCO2 capteurCO2) {
		this.capteurCO2Service.addCapteurCO2(capteurCO2);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurCO2(@RequestBody CapteurCO2 capteurCO2, @PathVariable int idCapteur) {
		if(capteurCO2Service.findByIdCapteurCO2(idCapteur)!=null){
			capteurCO2Service.addCapteurCO2(capteurCO2);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteuCO2r(@PathVariable int id) {
		if(capteurCO2Service.findByIdCapteurCO2(id)!= null){
			capteurCO2Service.deleteCapteurCO2(capteurCO2Service.findByIdCapteurCO2(id));
		}
	}


}
