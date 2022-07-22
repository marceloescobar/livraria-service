package com.mescobar.livrariaapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNotFoundException extends RuntimeException {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	public LivroNotFoundException(String message) {
		super(message);
	}

	public LivroNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
