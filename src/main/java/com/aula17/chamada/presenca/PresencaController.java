package com.aula17.chamada.presenca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/presencas")
public class PresencaController {
	
	@Autowired
	private PresencaRepository repository;
	
	@GetMapping
	public List<Presenca> listar() {
		
		return repository.findAll();
		
	}

}
