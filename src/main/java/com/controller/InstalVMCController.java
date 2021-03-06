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

import com.entity.InstalVMC;
import com.entity.Piece;
import com.entity.Programme;
import com.service.IInstalVMCService;
import com.service.IPieceService;
import com.service.IProgrammeService;

@RestController
@RequestMapping("/instal/VMC")
@CrossOrigin(origins = "http://localhost:4200")
public class InstalVMCController {

	@Autowired
	IInstalVMCService instalVMCService;
	@Autowired
	IPieceService pieceService;
	@Autowired
	IProgrammeService programmeService;
	
	//postman ok
	@GetMapping(value = "/all")
	public List<InstalVMC> getAllInstalsVMC() {
		return instalVMCService.getAllInstalsVMC();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalVMC(@RequestBody InstalVMC instal) {
		this.instalVMCService.addInstalVMC(instal);
	}
	//postman ok
	@GetMapping(value = "/ID/{idInstal}")
	public InstalVMC findById(@PathVariable int idInstal) {
		return instalVMCService.findById(idInstal);
	}
	//postman ok
	@GetMapping(value = "/etat/{etat}")
	public List<InstalVMC> findByEtat(@PathVariable boolean etat) {
		return instalVMCService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<InstalVMC> findByPiece(@PathVariable int idpiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idpiece);
		return instalVMCService.findByPiece(piece);
	}

	@SuppressWarnings("null")
	@GetMapping(value = "/IDProg/{idprog}")
	public List<InstalVMC> findByProgramme(@PathVariable int idprog) {
		Programme programme  = programmeService.findByIdProg(idprog);
		List<Programme> programmes = null;
		programmes.add(programme);
		return instalVMCService.findByProgrammes(programmes);
	}

	@PutMapping("/actived/{idProg}")
	public void actived(@RequestBody InstalVMC InstalVMC, @PathVariable int idProg) {
		if (instalVMCService.findById(idProg) != null) {
			instalVMCService.addInstalVMC(InstalVMC);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstalVMC(@RequestBody InstalVMC InstalVMC, @PathVariable int idInstal) {
		if (instalVMCService.findById(idInstal) != null) {
			instalVMCService.addInstalVMC(InstalVMC);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstalVMC(@PathVariable int idInstall) {
		if (instalVMCService.findById(idInstall) != null) {
			instalVMCService.deleteInstalVMC(instalVMCService.findById(idInstall));
		}
	}
}
