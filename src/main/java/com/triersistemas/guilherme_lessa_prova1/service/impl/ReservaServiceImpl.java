package com.triersistemas.guilherme_lessa_prova1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.triersistemas.guilherme_lessa_prova1.dto.ReservaDto;
import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity.Cliente;
import com.triersistemas.guilherme_lessa_prova1.entity.Reserva;

import com.triersistemas.guilherme_lessa_prova1.repository.ClienteRepository;
import com.triersistemas.guilherme_lessa_prova1.repository.ReservaRepository;

import java.time.LocalDate;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	public Reserva criarReserva(Long clienteId, Reserva reserva) {

		Optional<Cliente> cliente = clienteRepository.findById(clienteId);
		if (!cliente.isPresent()) {
			throw new IllegalArgumentException("Cliente não encontrado");
		}

		if (reserva.getDataReserva().isBefore(LocalDate.now())) {
			throw new IllegalArgumentException("Não é possível reservar para uma data no passado");
		}

		List<Reserva> reservasExistentes = reservaRepository.findByDataReservaAndNumeroMesa(reserva.getDataReserva(),
				reserva.getNumeroMesa());
		if (!reservasExistentes.isEmpty()) {
			throw new IllegalArgumentException("Mesa já reservada para a data selecionada");
		}

		reserva.setCliente(cliente.get());
		return reservaRepository.save(reserva);
	}

	public List<Reserva> listarReservasPorCliente(Long clienteId) {
		Optional<Cliente> cliente = clienteRepository.findById(clienteId);
		if (cliente.isPresent()) {
			return reservaRepository.findByCliente(cliente.get());
		}
		return null;
	}

	public boolean verificarDisponibilidadeMesa(LocalDate dataReserva, Integer numeroMesa) {
		List<Reserva> reservasExistentes = reservaRepository.findByDataReservaAndNumeroMesa(dataReserva, numeroMesa);
		return reservasExistentes.isEmpty();
	}

	public Reserva alterarStatusReserva(Long reservaId, Reserva.Status status) {
		Optional<Reserva> reserva = reservaRepository.findById(reservaId);
		if (reserva.isPresent()) {
			Reserva r = reserva.get();

			if (status == Reserva.Status.CONCLUIDA && r.getDataReserva().isBefore(LocalDate.now())) {
				throw new IllegalArgumentException("Não é possível marcar como concluída para uma data passada");
			}
			if (status == Reserva.Status.CANCELADA && r.getDataReserva().isBefore(LocalDate.now().plusDays(1))) {
				throw new IllegalArgumentException("Cancelamento só é permitido com um dia de antecedência");
			}
			r.setStatus(status);
			return reservaRepository.save(r);
		}
		return null;
	}
}
