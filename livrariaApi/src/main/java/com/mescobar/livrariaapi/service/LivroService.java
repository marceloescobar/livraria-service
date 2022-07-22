package com.mescobar.livrariaapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mescobar.livrariaapi.exception.LivroNotFoundException;
import com.mescobar.livrariaapi.model.Livro;
import com.mescobar.livrariaapi.repository.LivroRepository;

import lombok.Data;

@Data
@Service
public class LivroService {

	private final LivroRepository livroRepository;

	public List<Livro> obterTodos() {
		return livroRepository.findAll();
	}

	public Livro obter(Long id) {

		return livroRepository.findById(id)
				.orElseThrow(() -> new LivroNotFoundException("livro não encontrado com o id: " + id));

	}

	public Livro salvar(Livro livro) {
		return this.livroRepository.save(livro);
	}
}
