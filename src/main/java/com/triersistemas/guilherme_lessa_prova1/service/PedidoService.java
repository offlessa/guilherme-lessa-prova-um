package com.triersistemas.guilherme_lessa_prova1.service;

import java.time.LocalDate;
import java.util.List;

import com.triersistemas.guilherme_lessa_prova1.dto.PedidoDto;

public interface PedidoService {
    PedidoDto criarPedido(PedidoDto pedidoDto);
    PedidoDto atualizarPedido(Long id, PedidoDto pedidoDto);
    PedidoDto buscarPedido(Long id);

	List<PedidoDto> buscarPedidosPorData(LocalDate data);

}