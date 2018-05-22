package com.cleberflima.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cleberflima.cursomc.domain.Categoria;
import com.cleberflima.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository rep;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> cat = rep.findById(id);
		return cat.orElse(null);		
	}
}
