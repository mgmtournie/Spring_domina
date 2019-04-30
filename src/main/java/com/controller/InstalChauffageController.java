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

import com.entity.InstalChauffage;
import com.service.IInstalChauffageService;

@RestController
@RequestMapping("/instal/Chauffage")
@CrossOrigin(origins = "http://localhost:8034")
public class InstalChauffageController {

	@Autowired
	IInstalChauffageService instalChauffageService;
	//postman ok
	@GetMapping(value = "/all")
	public List<InstalChauffage> getAllInstalsChauffage() {
		return instalChauffageService.getAllInstalsChauffage();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalChauffage(@RequestBody InstalChauffage instal) {
		this.instalChauffageService.addInstalChauffage(instal);
	}
	//postman ok
	@GetMapping(value = "/ID/{idInstal}")
	public InstalChauffage findById(@PathVariable int idInstal) {
		return instalChauffageService.findById(idInstal);
	}
	//postman ok
	@GetMapping(value = "/etat/{etat}")
	public List<InstalChauffage> findByEtat(@PathVariable boolean etat) {
		return instalChauffageService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<InstalChauffage> findByPiece(@PathVariable int idpiece) {
		return instalChauffageService.findByPiece(idpiece);
	}

	@GetMapping(value = "/IDProg/{idprog}")
	public List<InstalChauffage> findByProgramme(@PathVariable int idprog) {
		return instalChauffageService.findByProgramme(idprog);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody InstalChauffage InstalChauffage, @PathVariable int idProg) {
		if (instalChauffageService.findById(idProg) != null) {
			instalChauffageService.addInstalChauffage(InstalChauffage);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstalChauffage(@RequestBody InstalChauffage InstalChauffage, @PathVariable int idInstal) {
		if (instalChauffageService.findById(idInstal) != null) {
			instalChauffageService.addInstalChauffage(InstalChauffage);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstalChauffage(@PathVariable int idInstall) {
		if (instalChauffageService.findById(idInstall) != null) {
			instalChauffageService.deleteInstalChauffage(instalChauffageService.findById(idInstall));
		}
	}
}
