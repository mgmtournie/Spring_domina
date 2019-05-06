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

import com.entity.InstalVolet;
import com.entity.Piece;
import com.entity.Programme;
import com.service.IInstalVoletService;
import com.service.IPieceService;
import com.service.IProgrammeService;

@RestController
@RequestMapping("/instal/Volet")
@CrossOrigin(origins = "http://localhost:4200")
public class InstalVoletController {

	@Autowired
	IInstalVoletService instalVoletService;
	@Autowired
	IPieceService pieceService;
	@Autowired
	IProgrammeService programmeService;
	//postman ok
	@GetMapping(value = "/all")
	public List<InstalVolet> getAllInstalVolets() {
		return instalVoletService.getAllInstalsVolet();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalVolet(@RequestBody InstalVolet instal) {
		this.instalVoletService.addInstalVolet(instal);
	}
	//postman ok
	@GetMapping(value = "/ID/{idInstal}")
	public InstalVolet findById(@PathVariable int idInstal) {
		return instalVoletService.findById(idInstal);
	}
	//postman ok
	@GetMapping(value = "/etat/{etat}")
	public List<InstalVolet> findByEtat(@PathVariable boolean etat) {
		return instalVoletService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<InstalVolet> findByPiece(@PathVariable int idpiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idpiece);
		return instalVoletService.findByPiece(piece);
	}

	@SuppressWarnings("null")
	@GetMapping(value = "/IDProg/{idprog}")
	public List<InstalVolet> findByProgramme(@PathVariable int idprog) {
		Programme programme  = programmeService.findByIdProg(idprog);
		List<Programme> programmes = null;
		programmes.add(programme);
		return instalVoletService.findByProgrammes(programmes);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody InstalVolet InstalVolet, @PathVariable int idProg) {
		if (instalVoletService.findById(idProg) != null) {
			instalVoletService.addInstalVolet(InstalVolet);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstalVolet(@RequestBody InstalVolet InstalVolet, @PathVariable int idInstal) {
		if (instalVoletService.findById(idInstal) != null) {
			instalVoletService.addInstalVolet(InstalVolet);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstalVolet(@PathVariable int idInstall) {
		if (instalVoletService.findById(idInstall) != null) {
			instalVoletService.deleteInstalVolet(instalVoletService.findById(idInstall));
		}
	}
}
