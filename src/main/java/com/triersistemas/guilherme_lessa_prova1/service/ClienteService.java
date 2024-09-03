package com.triersistemas.guilherme_lessa_prova1.service;

import java.util.List;

import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;

public interface ClienteService {
    ClienteDto criarCliente(ClienteDto clienteDto);
    ClienteDto atualizarCliente(Long id, ClienteDto clienteDto);
    ClienteDto buscarCliente(Long id);
    void deletarCliente(Long id);
    List<ClienteDto> listarClientes();
}
