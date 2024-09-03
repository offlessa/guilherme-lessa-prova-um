package com.triersistemas.guilherme_lessa_prova1.service.impl;

import org.springframework.stereotype.Service;
import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.repository.ReservaRepository;
import com.triersistemas.guilherme_lessa_prova1.service.ReservaService;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
	// injetar repositório
	private final ReservaRepository reservaRepository;

	public ReservaServiceImpl(ReservaRepository reservaRepository) {
		this.reservaRepository = reservaRepository;
	}

	@Override
	public ReservaDto criarReserva(ReservaDto reservaDto) {
		// falta implementar a lógica
	}

	@Override
	public ReservaDto atualizarReserva(Long id, ReservaDto reservaDto) {
		// falta implementar a lógica
	}

	@Override
	public ReservaDto buscarReserva(Long id) {
		// falta implementar a lógica
	}

	@Override
	public void cancelarReserva(Long id) {
		// falta implementar a lógica
	}

	@Override
	public List<ReservaDto> buscarReservasPorData(LocalDate data) {
		// falta implementar a lógica
	}
}
