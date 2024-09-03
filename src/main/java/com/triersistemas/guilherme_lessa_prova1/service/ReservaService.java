package com.triersistemas.guilherme_lessa_prova1.service;

import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import java.util.List;
import java.time.LocalDate;

public interface ReservaService {
	ReservaDto criarReserva(ReservaDto reservaDto);

	ReservaDto atualizarReserva(Long id, ReservaDto reservaDto);

	ReservaDto buscarReserva(Long id);

	void cancelarReserva(Long id);

	List<ReservaDto> buscarReservasPorData(LocalDate data);

}