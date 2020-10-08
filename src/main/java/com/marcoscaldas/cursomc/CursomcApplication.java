package com.marcoscaldas.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcoscaldas.cursomc.domain.Categoria;
import com.marcoscaldas.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{ // com esse implemento é possivel iniciar app com dados

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

@Override
public void run(String... args) throws Exception {
	
	//criar os objetos
	Categoria cat1 = new Categoria(null, "Informática");
	Categoria cat2 = new Categoria(null, "Escritório");
	
	//salvar os objetos
	
	categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	
}

}
