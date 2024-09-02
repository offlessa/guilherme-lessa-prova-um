package com.triersistemas.guilherme_lessa_prova1.service;

import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;

import java.util.Optional;

public interface ClienteService {
	ClienteEntity criarCliente(ClienteDto clienteDto);

	ClienteEntity atualizarCliente(Long id, ClienteDto clienteDto);

	Optional<ClienteEntity> encontrarClientePorEmail(String email);
}
