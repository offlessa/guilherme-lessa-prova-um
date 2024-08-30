package com.triersistemas.guilherme_lessa_prova1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity.Cliente;
import com.triersistemas.guilherme_lessa_prova1.repository.ClienteRepository;

	@Service
	public class ClienteServiceImpl implements ClienteService  {

	    @Autowired
	    private ClienteRepository clienteRepository;

	    public Cliente criarCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    public Cliente alterarCliente(Long id, Cliente cliente) {
	        Optional<Cliente> clienteExistente = clienteRepository.findById(id);
	        if (clienteExistente.isPresent()) {
	            Cliente c = clienteExistente.get();
	            c.setNome(cliente.getNome());
	            c.setEmail(cliente.getEmail());
	            return clienteRepository.save(c);
	        }
	        return null;
	    }
	}