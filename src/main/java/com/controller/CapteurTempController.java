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
import com.service.ICapteurTempService;

@RestController
@RequestMapping("/capteur/temp")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurTempController {
	
	@Autowired
	ICapteurTempService capteurTempService; 
	
	@GetMapping(value= "/all")
	public List<CapteurTemp> getAllCapteursTemp() {
		return this.capteurTempService.getAllCapteursTemp();
	}

	@GetMapping(value= "/Id/{id}")
	public CapteurTemp findByIdCapteurTemp(int id) {
		return this.capteurTempService.findByIdCapteurTemp(id);
	}

	@GetMapping(value= "/Piece/{idpiece}")
	public List<CapteurTemp> findByPiece(int idPiece) {
		return this.capteurTempService.findByPiece(idPiece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurTemp(CapteurTemp capteurTemp) {
		this.capteurTempService.addCapteurTemp(capteurTemp);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurTemp(@RequestBody CapteurTemp capteurTemp, @PathVariable int idCapteur) {
		if(capteurTempService.findByIdCapteurTemp(idCapteur)!=null){
			capteurTempService.addCapteurTemp(capteurTemp);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteuTempr(@PathVariable int id) {
		if(capteurTempService.findByIdCapteurTemp(id)!= null){
			capteurTempService.deleteCapteurTemp(capteurTempService.findByIdCapteurTemp(id));
		}
	}


}
