package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping(value= "/{id}")
	public Capteur findByIdCapteur(int id){
		return capteurService.findByIdCapteur(id);
	}
	@GetMapping(value= "/{type}")
	public List<Capteur> findByType(String type){
		return capteurService.findByType(type);
	}
	@GetMapping(value= "/{idpiece}")
	public List<Capteur> findByPiece(int idPiece){
		return capteurService.findByPiece(idPiece);
	}
	
	

}
