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

import com.entity.Installation;
import com.entity.Piece;
import com.entity.Programme;
import com.service.IInstallationService;
import com.service.IPieceService;
import com.service.IProgrammeService;

@RestController
@RequestMapping("/instal")
@CrossOrigin(origins = "http://localhost:8034")
public class InstallationController {

	@Autowired
	IInstallationService installationService;
	@Autowired
	IPieceService pieceService;
	@Autowired
	IProgrammeService programmeService;
	
	
	@GetMapping(value = "/all")
	public List<Installation> getAllInstallations() {
		return installationService.getAllInstallations();
	}
	//postman ok
	@PostMapping(value = "/addInstall", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addInstallation(@RequestBody Installation instal) {
		this.installationService.addInstallation(instal);
	}
	//postman ok
	@GetMapping(value = "/ID/{idInstal}")
	public Installation findById(@PathVariable int idInstal) {
		return installationService.findById(idInstal);
	}
	//postman ok
	@GetMapping(value = "/type/{type}")
	public List<Installation> findByType(@PathVariable String type) {
		return installationService.findByType(type);
	}
	//postman ok
	@GetMapping(value = "/etat/{etat}")
	public List<Installation> findByEtat(@PathVariable boolean etat) {
		return installationService.findByEtat(etat);
	}

	@GetMapping(value = "/piece/{idpiece}")
	public List<Installation> findByPiece(@PathVariable int idpiece) {
		Piece piece = new Piece();
		piece = pieceService.findByIdPiece(idpiece);
		return installationService.findByPiece(piece);
	}

	@SuppressWarnings("null")
	@GetMapping(value = "/IDProg/{idprog}")
	public List<Installation> findByProgramme(@PathVariable int idprog) {
		Programme programme  = programmeService.findByIdProg(idprog);
		List<Programme> programmes = null;
		programmes.add(programme);
		return installationService.findByProgramme(programmes);
	}

	@PutMapping("/{idProg}")
	public void actived(@RequestBody Installation installation, @PathVariable int idProg) {
		if (installationService.findById(idProg) != null) {
			installationService.addInstallation(installation);
		}

	}

	@PutMapping("/{idInstal}")
	public void updateInstallation(@RequestBody Installation installation, @PathVariable int idInstal) {
		if (installationService.findById(idInstal) != null) {
			installationService.addInstallation(installation);
		}
	}

	@DeleteMapping(value = "/{idInstall}")
	public void deleteInstallation(@PathVariable int idInstall) {
		if (installationService.findById(idInstall) != null) {
			installationService.deleteInstallation(installationService.findById(idInstall));
		}
	}

}