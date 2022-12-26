package dev.evandro.estudo.service;

import java.util.ArrayList;
import java.util.Optional;

import dev.evandro.estudo.model.Pessoa;


public interface PessoaService {
	public Optional<ArrayList<Pessoa>> recuperarTodos();
}
