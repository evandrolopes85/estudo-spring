package dev.evandro.estudo.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import dev.evandro.estudo.model.Pessoa;
import dev.evandro.estudo.repository.PessoaRepository;

@SpringBootTest
@ActiveProfiles("test")
public class PessoaTest {

	@InjectMocks
	private PessoaServiceImpl service;
	
	@Mock
	private PessoaRepository repository;
	
	private ArrayList<Pessoa> listaDePessoas;
	
	@BeforeEach
	public void setup() {
		listaDePessoas = new ArrayList<Pessoa>();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setId(1);
		p1.setNome("Evandro");
		
		p2.setId(2);
		p2.setNome("Nete");
		
		listaDePessoas.add(p1);
		listaDePessoas.add(p2);
		
		Mockito.when(repository.findAll()).thenReturn(new ArrayList<Pessoa>());
		Mockito.when(repository.findAll()).thenReturn(listaDePessoas);
		
	}
	
	@Test
	public void deveriaRecuperarTodasPessoas() {
		assertTrue(service.recuperarTodos().get().size() > 0);
	}
	
	@Test
	public void deveriaRetornarListaVazia() {
		assertTrue(service.recuperarTodos().get().isEmpty());
	}
}
