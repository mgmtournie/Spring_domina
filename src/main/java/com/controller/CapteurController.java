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
import com.service.ICapteurService;

@RestController
@RequestMapping("/capteur")
@CrossOrigin(origins = "http://localhost:8034")
public class CapteurController {
	
	@Autowired
	ICapteurService capteurService; 
	
	@GetMapping(value= "/all")
	public List<Capteur> getAllCapteurs(){
		return capteurService.getAllCapteurs();
	}
	@GetMapping(value= "/Id{id}")
	public Capteur findByIdCapteur(int id){
		return capteurService.findByIdCapteur(id);
	}
	@GetMapping(value= "/Type{type}")
	public List<Capteur> findByType(String type){
		return capteurService.findByType(type);
	}
	@GetMapping(value= "/Piece{idpiece}")
	public List<Capteur> findByPiece(int idPiece){
		return capteurService.findByPiece(idPiece);
	}
	
	@PostMapping(value = "/addCapteur", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addCapteur (Capteur capteur){
		this.capteurService.addCapteur(capteur);
	}
	@PutMapping("/{idCapteur}")
	public void  updateCapteur (@RequestBody Capteur capteur, @PathVariable int idCapteur){
		if (capteurService.findByIdCapteur(idCapteur)!= null){
			capteurService.addCapteur(capteur);
		}
	}
	@DeleteMapping("/{idCapteur}")
	public void deleteCapteur (@PathVariable int idCapteur){
		if (capteurService.findByIdCapteur(idCapteur)!= null){
			capteurService.deleteCapteur(capteurService.findByIdCapteur(idCapteur));
		}
	}

}
