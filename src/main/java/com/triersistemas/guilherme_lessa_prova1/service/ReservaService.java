package com.triersistemas.guilherme_lessa_prova1.service;

import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ReservaEntity;
import com.triersistemas.guilherme_lessa_prova1.enums.StatusEnum;

import java.util.List;

import java.time.LocalDate;


public interface ReservaService {
    ReservaEntity criarReserva(ReservaDto reservaDto);
    List<ReservaEntity> listarReservasPorCliente(Long clienteId);
    boolean verificarDisponibilidadeMesa(LocalDate dataReserva, Integer numeroMesa);

	ReservaEntity alterarStatusReserva(Long reservaId, StatusEnum status);
}
