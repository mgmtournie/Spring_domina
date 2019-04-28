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
import com.service.ICapteurHumiditeService;

@RestController
@RequestMapping("/capteur/humidite")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurHumiditeController {
	
	@Autowired
	ICapteurHumiditeService capteurHumiditeService; 
	
	@GetMapping(value= "/all")
	public List<CapteurHumidite> getAllCapteursCO2() {
		return this.capteurHumiditeService.getAllCapteurHumidites();
	}

	@GetMapping(value= "/{id}")
	public  CapteurHumidite findByIdCapteurHumidite(int id) {
		return this.capteurHumiditeService.findByIdCapteurHumidite(id);
	}

	@GetMapping(value= "/{idpiece}")
	public List<CapteurHumidite> findByPiece(int idPiece) {
		return this.capteurHumiditeService.findByPiece(idPiece);
	}

	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteurHumidite(CapteurHumidite capteurHumidite) {
		this.capteurHumiditeService.addCapteurHumidite(capteurHumidite);
	}

	@PutMapping("/{idCapteur}")
	public void updateCapteurHumidite(@RequestBody CapteurHumidite capteurHumidite, @PathVariable int idCapteur) {
		if(capteurHumiditeService.findByIdCapteurHumidite(idCapteur)!=null){
			capteurHumiditeService.addCapteurHumidite(capteurHumidite);
		}
	}

	@DeleteMapping("/{idCapteur}")
	public void deleteCapteuCO2r(@PathVariable int id) {
		if(capteurHumiditeService.findByIdCapteurHumidite(id)!= null){
			capteurHumiditeService.deleteCapteurHumidite(capteurHumiditeService.findByIdCapteurHumidite(id));
		}
	}


}
