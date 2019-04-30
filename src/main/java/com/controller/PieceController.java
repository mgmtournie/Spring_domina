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

import com.entity.Piece;
import com.service.IPieceService;

@RestController
@RequestMapping("/piece")
@CrossOrigin(origins = "http://localhost:8034")
public class PieceController {

	@Autowired
	IPieceService pieceService;
	//postman ok
	@GetMapping(value = "/all")
	public List<Piece> getAllPieces() {
		return pieceService.getAllPieces();
	}
	//postman ok
	@GetMapping(value = "/ID/{idPiece}")
	public Piece findByIdPiece(@PathVariable int idPiece) {
		return pieceService.findByIdPiece(idPiece);
	}
	//postman ok
	@GetMapping(value = "/Nom/{nomPiece}")
	public Piece findByNomPiece(@PathVariable String nomPiece) {
		return pieceService.findByNomPiece(nomPiece);
	}

	@PostMapping(value = "/addPiece", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPiece(@RequestBody Piece piece) {
		this.pieceService.addPiece(piece);
	}

	@PutMapping("/{idPiece}")
	public void updatePiece(@RequestBody Piece piece, @PathVariable int idPiece) {
		if (pieceService.findByIdPiece(idPiece) != null) {
			pieceService.addPiece(piece);
		}
	}

	@DeleteMapping("/{idPiece}")
	public void deletePiece(@PathVariable int idPiece) {
		if (pieceService.findByIdPiece(idPiece) != null) {
			pieceService.deletePiece(pieceService.findByIdPiece(idPiece));
		}
	}
}
