package com.mescobar.livrariaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mescobar.livrariaapi.dto.LivroRequest;
import com.mescobar.livrariaapi.model.Livro;
import com.mescobar.livrariaapi.service.LivroService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LivroController {

	private LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}

	@GetMapping("/livros")
	public List<Livro> getLivros() {
		return livroService.obterTodos();
	}

	@GetMapping("/livros/{id}")
	public ResponseEntity<Livro> getLivro(@PathVariable("id") Long id) {

		return ResponseEntity.ok().body(livroService.obter(id));

	}

	@PostMapping("/livros")
	public ResponseEntity<Livro> salvar(@RequestBody @Valid LivroRequest livroRequest) {

		return new ResponseEntity<>(livroService.salvar(this.converter(livroRequest)),HttpStatus.CREATED);

	}
	
	private Livro converter(LivroRequest livroRequest) {
		return Livro.builder()
				.titulo(livroRequest.getTitulo())
				.autor(livroRequest.getAutor())
				.build();
	}
}
