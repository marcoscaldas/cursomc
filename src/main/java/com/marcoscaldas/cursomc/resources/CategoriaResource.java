package com.marcoscaldas.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")  // endpoint do rest
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public String Listar() {
		return "REST está funcionando!";
	}
}
