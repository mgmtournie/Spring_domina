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

import com.entity.InstalEclairage;
import com.service.IInstalEclairageService;

@RestController
@RequestMapping("/instal/Eclairage")
@CrossOrigin(origins = "http://localhost:8034")
public class InstalEclairageController {

	@Autowired
	IInstalEclairageService instalEclairageService;
	//postman ok
	@GetMapping(value = "/all")
	public List<InstalEclairage> getAllInstalsEclairage() {
		return instalEclairageService.getAllInstalsEclairage();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalEclairage(@RequestBody InstalEclairage instal) {
		this.instalEclairageService.addInstalEclairage(instal);
	}
	//postman ok
	@GetMapping(value = "/ID/{idInstal}")
	public InstalEclairage findById(@PathVariable int idInstal) {
		return instalEclairageService.findById(idInstal);
	}
	//postman ok
	@GetMapping(value = "/etat/{etat}")
	public List<InstalEclairage> findByEtat(@PathVariable boolean etat) {
		return instalEclairageService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<InstalEclairage> findByPiece(@PathVariable int idpiece) {
		return instalEclairageService.findByPiece(idpiece);
	}

	@GetMapping(value = "/IDProg/{idprog}")
	public List<InstalEclairage> findByProgramme(@PathVariable int idprog) {
		return instalEclairageService.findByProgrammes(idprog);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody InstalEclairage InstalEclairage, @PathVariable int idProg) {
		if (instalEclairageService.findById(idProg) != null) {
			instalEclairageService.addInstalEclairage(InstalEclairage);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstalEclairage(@RequestBody InstalEclairage InstalEclairage, @PathVariable int idInstal) {
		if (instalEclairageService.findById(idInstal) != null) {
			instalEclairageService.addInstalEclairage(InstalEclairage);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstalEclairage(@PathVariable int idInstall) {
		if (instalEclairageService.findById(idInstall) != null) {
			instalEclairageService.deleteInstalEclairage(instalEclairageService.findById(idInstall));
		}
	}
}
