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

import com.entity.Programme;
import com.service.IProgrammeService;

@RestController
@RequestMapping("/prog")
@CrossOrigin(origins = "http://localhost:4200")
public class ProgrammeController {

	@Autowired
	IProgrammeService programmeService;
	//postman ok
	@GetMapping(value = "/all")
	public List<Programme> getAllProgrammes() {
		return programmeService.getAllProgrammes();
	}
	//postman ok
	@GetMapping(value = "/ID/{idProg}")
	public Programme findByIdProg(@PathVariable int idProg) {
		return programmeService.findByIdProg(idProg);
	}
	//postman ok
	@GetMapping(value = "/Nom/{nomProg}")
	public Programme findByNomProg(@PathVariable String nomProg) {
		return programmeService.findByNomProg(nomProg);
	}

	@PostMapping(value = "/addprog", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addProgramme(@RequestBody Programme programme) {
		this.programmeService.addProgramme(programme);
	}

	@PutMapping("/{idProg}")
	public void updateProgramme(@RequestBody Programme programme, @PathVariable int idProg) {
		if (programmeService.findByIdProg(idProg) != null) {
			programmeService.addProgramme(programme);
		}
	}

	@DeleteMapping("/{idProg}")
	public void deleteUser(@PathVariable int idProg) {
		if (programmeService.findByIdProg(idProg) != null) {
			programmeService.deleteProgramme(programmeService.findByIdProg(idProg));
		}
	}
}
