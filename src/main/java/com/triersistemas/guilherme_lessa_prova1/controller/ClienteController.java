package com.triersistemas.guilherme_lessa_prova1.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.triersistemas.guilherme_lessa_prova1.dto.ClienteDto;
import com.triersistemas.guilherme_lessa_prova1.service.ClienteService;


@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ClienteDto criarCliente(@RequestBody ClienteDto clienteDto) {
        return clienteService.criarCliente(clienteDto);
    }

    @PutMapping("/{id}")
    public ClienteDto atualizarCliente(@PathVariable Long id, @RequestBody ClienteDto clienteDto) {
        return clienteService.atualizarCliente(id, clienteDto);
    }

    @GetMapping("/{id}")
    public ClienteDto buscarCliente(@PathVariable Long id) {
        return clienteService.buscarCliente(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }

    @GetMapping
    public List<ClienteDto> listarClientes() {
        return clienteService.listarClientes();
    }
}
