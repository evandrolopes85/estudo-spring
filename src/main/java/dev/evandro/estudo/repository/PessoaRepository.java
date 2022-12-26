package dev.evandro.estudo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.evandro.estudo.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer>{

}
