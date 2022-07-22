package com.mescobar.livrariaapi.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroRequest {

	@NotBlank(message = "titulo invalido: Titulo em branco")
	@NotNull(message = "titulo invalido: titulo nao pode ser nulo")
	private String titulo;

	@NotBlank(message = "autor invalido: Autor em branco")
	@NotNull(message = "autor invalido: autor nao pode ser nulo")
	private String autor;
}
