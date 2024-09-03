package com.triersistemas.guilherme_lessa_prova1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;
import com.triersistemas.guilherme_lessa_prova1.repository.ClienteRepository;
import com.triersistemas.guilherme_lessa_prova1.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	 // injetar repositório
	
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDto criarCliente(ClienteDto clienteDto) {
    	 // falta implementar a lógica
    }

    @Override
    public ClienteDto atualizarCliente(Long id, ClienteDto clienteDto) {
    	 // falta implementar a lógica
    }

    @Override
    public ClienteDto buscarCliente(Long id) {
    	 // falta implementar a lógica
    }

    @Override
    public void deletarCliente(Long id) {
    	 // falta implementar a lógica 
    }

    @Override
    public List<ClienteDto> listarClientes() {
    	 // falta implementar a lógica
    }
}
