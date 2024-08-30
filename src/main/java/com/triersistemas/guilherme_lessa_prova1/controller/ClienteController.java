package com.triersistemas.guilherme_lessa_prova1.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity.Cliente;
import com.triersistemas.guilherme_lessa_prova1.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente) {
		return clienteService.criarCliente(cliente);
	}

	@PutMapping("/{id}")
	public Cliente alterarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
		return clienteService.alterarCliente(id, cliente);
	}
}
