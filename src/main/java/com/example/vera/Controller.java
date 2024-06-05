package com.example.vera;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vera.model.Produtos;
import com.example.vera.model.repositories.Repository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto/inserir")
public class Controller {
	
	@Autowired
	private Repository repository;
	@PostMapping
	public @ResponseBody Produtos produto(@Valid Produtos produto) {
		repository.save(produto);
		return produto;
	}
	
}
