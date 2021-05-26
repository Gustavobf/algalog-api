package com.algaworks.algalog.api.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

	@PersistenceContext
	private EntityManager manager;

	@GetMapping
	public List<Cliente> listar() {

		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}

}
