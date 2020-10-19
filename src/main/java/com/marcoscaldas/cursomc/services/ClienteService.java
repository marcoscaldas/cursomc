package com.marcoscaldas.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcoscaldas.cursomc.domain.Cliente;
import com.marcoscaldas.cursomc.repositories.ClienteRepository;
import com.marcoscaldas.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	//para instanciar no spring  nao precisar dar o new
	@Autowired
	private ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
