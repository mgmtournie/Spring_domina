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

import com.entity.InstalChauffeEau;
import com.service.IInstalChauffeEauService;

@RestController
@RequestMapping("/instal/ChauffeEau")
@CrossOrigin(origins = "http://localhost:8034")
public class InstalChauffeEauController {

	@Autowired
	IInstalChauffeEauService instalChauffeEauService;

	@GetMapping(value = "/all")
	public List<InstalChauffeEau> getAllInstalsChauffeEau() {
		return instalChauffeEauService.getAllInstalsChauffeEau();
	}

	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstalChauffeEau(@RequestBody InstalChauffeEau instal) {
		this.instalChauffeEauService.addInstalChauffeEau(instal);
	}

	@GetMapping(value = "/ID/{idInstal}")
	public InstalChauffeEau findById(@PathVariable int idInstal) {
		return instalChauffeEauService.findById(idInstal);
	}

	@GetMapping(value = "/etat/{etat}")
	public List<InstalChauffeEau> findByEtat(@PathVariable boolean etat) {
		return instalChauffeEauService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<InstalChauffeEau> findByPiece(@PathVariable int idpiece) {
		return instalChauffeEauService.findByPiece(idpiece);
	}

	@GetMapping(value = "/IDProg/{idProg}")
	public List<InstalChauffeEau> findByProgramme(@PathVariable int idProg) {
		return instalChauffeEauService.findByProgrammes(idProg);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody InstalChauffeEau InstalChauffeEau, @PathVariable int idProg) {
		if (instalChauffeEauService.findById(idProg) != null) {
			instalChauffeEauService.addInstalChauffeEau(InstalChauffeEau);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstalChauffeEau(@RequestBody InstalChauffeEau InstalChauffeEau, @PathVariable int idInstal) {
		if (instalChauffeEauService.findById(idInstal) != null) {
			instalChauffeEauService.addInstalChauffeEau(InstalChauffeEau);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstalChauffeEau(@PathVariable int idInstall) {
		if (instalChauffeEauService.findById(idInstall) != null) {
			instalChauffeEauService.deleteInstalChauffeEau(instalChauffeEauService.findById(idInstall));
		}
	}

}
