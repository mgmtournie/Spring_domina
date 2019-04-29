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

	@GetMapping(value = "/all")
	public List<InstalEclairage> getAllInstalEclairages() {
		return instalEclairageService.getAllInstalEclairages();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalEclairage(@RequestBody InstalEclairage instal) {
		this.instalEclairageService.addInstalEclairage(instal);
	}

	@GetMapping(value = "/ID/{idInstal}")
	public InstalEclairage findById(@PathVariable int id) {
		return instalEclairageService.findById(id);
	}

	@GetMapping(value = "/etat/{etatInst}")
	public List<InstalEclairage> findByEtat(@PathVariable boolean etat) {
		return instalEclairageService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{piece}")
	public List<InstalEclairage> findByPiece(@PathVariable int idpiece) {
		return instalEclairageService.findByPiece(idpiece);
	}

	@GetMapping(value = "/IDProg/{idProg}")
	public List<InstalEclairage> findByProgramme(@PathVariable int idprog) {
		return instalEclairageService.findByProgramme(idprog);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody InstalEclairage InstalEclairage, @PathVariable int id) {
		if (instalEclairageService.findById(id) != null) {
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
