package dev.evandro.estudo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.evandro.estudo.model.Pessoa;
import dev.evandro.estudo.service.PessoaService;


@RestController
public class PessoaController {
	
	private PessoaService service;
	
	public PessoaController(PessoaService service) {
		this.service = service;
	}
	
	@GetMapping("/pessoas")
	public ResponseEntity<ArrayList<Pessoa>> recuperarTodos(){
		if(service.recuperarTodos().isPresent()) {
			return ResponseEntity.ok(service.recuperarTodos().get());
		}
		
		return null;
	}
}
