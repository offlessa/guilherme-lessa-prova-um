package com.triersistemas.guilherme_lessa_prova1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;
import com.triersistemas.guilherme_lessa_prova1.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	public ResponseEntity<ClienteEntity> criarCliente(@RequestBody ClienteDto clienteDto) {
		ClienteEntity cliente = clienteService.criarCliente(clienteDto);
		return new ResponseEntity<>(cliente, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ClienteEntity> atualizarCliente(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
		ClienteEntity cliente = clienteService.atualizarCliente(id, clienteDto);
		return ResponseEntity.ok(cliente);
	}
}
