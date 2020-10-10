package com.marcoscaldas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcoscaldas.cursomc.domain.Categoria;
import com.marcoscaldas.cursomc.repositories.CategoriaRepository;
import com.marcoscaldas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	//para instanciar no spring  nao precisar dar o new
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
