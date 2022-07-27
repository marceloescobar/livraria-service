package com.mescobar.livrariaapi;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mescobar.livrariaapi.model.Livro;
import com.mescobar.livrariaapi.repository.LivroRepository;

@SpringBootApplication
public class LivrariaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApiApplication.class, args);
	}

	@Bean
	CommandLineRunner init(LivroRepository livroRepository) {
		return args -> {
			Stream.of("livro 1", "livro 2", "livro 3", "livro 4", "livro 5").forEach(titulo -> {
				Livro livro = Livro.builder().titulo(titulo).autor("autor famoso").build();
				livroRepository.save(livro);
			});

		};
	}

}
