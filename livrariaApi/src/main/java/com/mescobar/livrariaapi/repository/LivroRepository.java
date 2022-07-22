package com.mescobar.livrariaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mescobar.livrariaapi.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
