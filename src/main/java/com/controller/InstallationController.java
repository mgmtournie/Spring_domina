//package com.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.entity.Installation;
//import com.service.IInstallationService;
//
//@RestController
//@RequestMapping("/instal")
//@CrossOrigin(origins = "http://localhost:8034")
//public class InstallationController {
//
//	@Autowired
//	IInstallationService installationService;
//
//	@GetMapping(value = "/all")
//	public List<Installation> getAllInstallations() {
//		return installationService.getAllInstallations();
//	}
//
//	@PostMapping(value = "/addInstall", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void addInstallation(@RequestBody Installation instal) {
//		this.installationService.addInstallation(instal);
//	}
//
//	@GetMapping(value = "/{idInstal}")
//	public Installation findById(@PathVariable int id) {
//		return installationService.findById(id);
//	}
//
//	@GetMapping(value = "/{typeInstal}")
//	public List<Installation> findByType(@PathVariable String type) {
//		return installationService.findByType(type);
//	}
//
//	@GetMapping(value = "/{etatInst}")
//	public List<Installation> findByEtat(@PathVariable boolean etat) {
//		return installationService.findByEtat(etat);
//	}
//
//	@GetMapping(value = "/{piece}")
//	public List<Installation> findByPiece(@PathVariable int idpiece) {
//		return installationService.findByPiece(idpiece);
//	}
//
//	@GetMapping(value = "/{idProg}")
//	public List<Installation> findByProgramme(@PathVariable int idprog) {
//		return installationService.findByProgramme(idprog);
//	}
//
//	@PutMapping("/{idProg}")
//	public void actived(@RequestBody Installation installation, @PathVariable int id) {
//		if (installationService.findById(id) != null) {
//			installationService.addInstallation(installation);
//		}
//
//	}
//
//	@PutMapping("/{idInstal}")
//	public void updateInstallation(@RequestBody Installation installation, @PathVariable int idInstal) {
//		if (installationService.findById(idInstal) != null) {
//			installationService.addInstallation(installation);
//		}
//	}
//
//	@DeleteMapping(value = "/{idInstall")
//	public void deleteInstallation(@PathVariable int idInstall) {
//		if (installationService.findById(idInstall) != null) {
//			installationService.deleteInstallation(installationService.findById(idInstall));
//		}
//	}
//
//}
