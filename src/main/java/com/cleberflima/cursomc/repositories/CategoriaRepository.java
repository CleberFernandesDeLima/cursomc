package com.cleberflima.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleberflima.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
