package com.triersistemas.guilherme_lessa_prova1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;
import com.triersistemas.guilherme_lessa_prova1.entity.ReservaEntity;
import com.triersistemas.guilherme_lessa_prova1.enums.StatusEnum;
import com.triersistemas.guilherme_lessa_prova1.repository.ClienteRepository;
import com.triersistemas.guilherme_lessa_prova1.repository.ReservaRepository;
import com.triersistemas.guilherme_lessa_prova1.service.ReservaService;
import java.time.LocalDate;
import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public ReservaEntity criarReserva(ReservaDto reservaDto) {
		if (reservaDto.getDataReserva().isBefore(LocalDate.now())) {
			throw new RuntimeException("Não é possível reservar para uma data no passado");
		}
		if (reservaDto.getNumeroPessoas() < 1 || reservaDto.getNumeroPessoas() > 10) {
			throw new RuntimeException("O número de pessoas deve ser entre 1 e 10");
		}
		if (reservaDto.getNumeroMesa() < 1 || reservaDto.getNumeroMesa() > 20) {
			throw new RuntimeException("O número da mesa deve ser entre 1 e 20");
		}
		if (reservaRepository.existsByDataReservaAndNumeroMesa(reservaDto.getDataReserva(),
				reservaDto.getNumeroMesa())) {
			throw new RuntimeException("Mesa já reservada para a mesma data");
		}

		ClienteEntity cliente = clienteRepository.findById(reservaDto.getIdCliente())
				.orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

		ReservaEntity reserva = new ReservaEntity();
		reserva.setDataReserva(reservaDto.getDataReserva());
		reserva.setNumeroPessoas(reservaDto.getNumeroPessoas());
		reserva.setNumeroMesa(reservaDto.getNumeroMesa());
		reserva.setCliente(cliente);
		return reservaRepository.save(reserva);
	}

	@Override
	public List<ReservaEntity> listarReservasPorCliente(Long clienteId) {
		return reservaRepository.findByClienteId(clienteId);
	}

	@Override
	public boolean verificarDisponibilidadeMesa(LocalDate dataReserva, Integer numeroMesa) {
		return !reservaRepository.existsByDataReservaAndNumeroMesa(dataReserva, numeroMesa);
	}

	@Override
	public ReservaEntity alterarStatusReserva(Long reservaId, StatusEnum status) {
		ReservaEntity reserva = reservaRepository.findById(reservaId)
				.orElseThrow(() -> new RuntimeException("Reserva não encontrada"));

		if (status == StatusEnum.CONCLUIDA && reserva.getDataReserva().isBefore(LocalDate.now())) {
			throw new RuntimeException("A reserva só pode ser concluída se a data for hoje ou no futuro");
		}

		if (status == StatusEnum.CANCELADA && reserva.getDataReserva().isBefore(LocalDate.now().plusDays(1))) {
			throw new RuntimeException("A reserva só pode ser cancelada com um dia de antecedência");
		}

		reserva.setStatus(status);
		return reservaRepository.save(reserva);
	}
}
