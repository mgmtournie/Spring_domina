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
import com.entity.Installation;
import com.entity.Piece;
import com.service.IConsommationElecService;
import com.service.IInstallationService;
import com.service.IPieceService;

@RestController
@RequestMapping("/conso/Elec")
@CrossOrigin(origins = "http://localhost:8034")
public class ConsommationElecController {

	@Autowired
	IConsommationElecService ConsommationElecService;
	
	@Autowired
	IPieceService pieceService;
	
	@Autowired
	IInstallationService instalService;
	
	//postman ok
	@GetMapping(value = "/all")
	public List<ConsommationElec> getAllConsommationsElec() {
		return ConsommationElecService.getAllConsommationsElec();
	}

	@GetMapping(value = "/Piece/{idpiece}")
	public List<ConsommationElec> findByPieces(@PathVariable int idpiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idpiece);
		return ConsommationElecService.findByPiece(piece);
	}

	@GetMapping(value = "/Instal/{idinstal}")
	public ConsommationElec findByInstal(@PathVariable int idinstal) {
		Installation instal = new Installation();
		instal = instalService.findById(idinstal);
		return ConsommationElecService.findByInstal(instal);

	}

	@GetMapping(value = "/ID/{idConsommateur}")
	public ConsommationElec findByIdConsommateur(@PathVariable int idConsommateur) {
		return ConsommationElecService.findByIdConsommateur(idConsommateur);
	}

	@PostMapping(value = "/addConso", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addConsommationElec(ConsommationElec ConsommationElec) {
		this.ConsommationElecService.addConsommationElec(ConsommationElec);

	}

	@DeleteMapping(value = "/{idCons}")
	public void deleteConsommationElec(@PathVariable int idCons) {
		if (ConsommationElecService.findByIdConsommateur(idCons) != null) {
			ConsommationElecService.deleteConsommationElec(ConsommationElecService.findByIdConsommateur(idCons));
		}
	}

	@PutMapping("/{idCons}")
	public void updateConsommationElec(@RequestBody ConsommationElec ConsommationElec, @PathVariable int idCons) {
		if (ConsommationElecService.findByIdConsommateur(idCons) != null) {
			ConsommationElecService.addConsommationElec(ConsommationElec);
		}

	}

}
