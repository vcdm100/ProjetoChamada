package com.aula17.chamada.matricula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula17.chamada.matricula.DTO.DadosCadastroMatricula;

import jakarta.transaction.Transactional;

@RequestMapping("/matriculas")
@RestController()
public class MatriculaController {

	@Autowired
	private MatriculaRepository repository;
	
	@GetMapping()
	public List<Matricula> listagem() {
		
		return repository.findAll();
	}
	
	@PostMapping()
	@Transactional
	public void criar(@RequestBody DadosCadastroMatricula dados) {
		this.repository.save(new Matricula(dados));
	}
}
