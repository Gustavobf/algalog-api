package com.algaworks.algalog.api.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@GetMapping
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente(1L, "Joao", "joaodascouves@algaworks.com", "34 99999-1111");
		var cliente2 = new Cliente(2L, "Maria", "mariadasilva@algaworks.com", "34 99999-2222");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
}
