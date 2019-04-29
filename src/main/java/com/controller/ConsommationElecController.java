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

import com.entity.ConsommationElec;
import com.service.IConsommationElecService;

@RestController
@RequestMapping("/consoElec")
@CrossOrigin(origins = "http://localhost:8034")
public class ConsommationElecController {

	@Autowired
	IConsommationElecService ConsommationElecService;

	@GetMapping(value = "/all")
	public List<ConsommationElec> getAllConsommationElecs() {
		return ConsommationElecService.getAllConsommationElecs();
	}

	@GetMapping(value = "/Piece/{idpiece}")
	public List<ConsommationElec> findByPieces(int idpiece) {
		return ConsommationElecService.findByPieces(idpiece);
	}

	@GetMapping(value = "/Instal/{idinstal}")
	public ConsommationElec findByInstal(int idinstal) {
		return ConsommationElecService.findByInstal(idinstal);

	}

	@GetMapping(value = "/Id/{idConsommateur}")
	public ConsommationElec findByIdConsommateur(int idConsommateur) {
		return ConsommationElecService.findByIdConsommateur(idConsommateur);
	}

	@PostMapping(value = "/addConso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addConsommationElec(ConsommationElec ConsommationElec) {
		this.ConsommationElecService.addConsommationElec(ConsommationElec);

	}

	@DeleteMapping(value="/{idCons}")
	public void deleteConsommationElec(@PathVariable int idCons) {
		if (ConsommationElecService.findByIdConsommateur(idCons)!= null){
			ConsommationElecService.deleteConsommationElec(ConsommationElecService.findByIdConsommateur(idCons));
			}
		}

	@PutMapping("/{idCons}")
	public void updateConsommationElec(@RequestBody ConsommationElec ConsommationElec , @PathVariable int idCons) {
		if( ConsommationElecService.findByIdConsommateur(idCons)!= null){
			ConsommationElecService.addConsommationElec(ConsommationElec);
		}

	}

}
