package com.triersistemas.guilherme_lessa_prova1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;
import com.triersistemas.guilherme_lessa_prova1.repository.ClienteRepository;
import com.triersistemas.guilherme_lessa_prova1.service.ClienteService;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public ClienteEntity criarCliente(ClienteDto clienteDto) {
		ClienteEntity cliente = new ClienteEntity();
		cliente.setNome(clienteDto.getNome());
		cliente.setEmail(clienteDto.getEmail());
		return clienteRepository.save(cliente);
	}

	@Override
	public ClienteEntity atualizarCliente(Long id, ClienteDto clienteDto) {
		ClienteEntity cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
		cliente.setNome(clienteDto.getNome());
		cliente.setEmail(clienteDto.getEmail());
		return clienteRepository.save(cliente);
	}

	@Override
	public Optional<ClienteEntity> encontrarClientePorEmail(String email) {
		return clienteRepository.findByEmail(email);
	}
}
