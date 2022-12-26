package dev.evandro.estudo.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Component;

import dev.evandro.estudo.model.Pessoa;
import dev.evandro.estudo.repository.PessoaRepository;

@Component
public class PessoaServiceImpl implements PessoaService{
		
	private PessoaRepository repository;
	
	public PessoaServiceImpl(PessoaRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Optional<ArrayList<Pessoa>> recuperarTodos() {
		ArrayList<Pessoa> lista;
		lista = (ArrayList<Pessoa>) repository.findAll();
		
		if(lista != null) {
			return Optional.of(lista);
		}
		
		return Optional.empty();
	}

}
