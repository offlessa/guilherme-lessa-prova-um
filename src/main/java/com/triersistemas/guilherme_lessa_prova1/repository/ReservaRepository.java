package com.triersistemas.guilherme_lessa_prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity.Cliente;
import com.triersistemas.guilherme_lessa_prova1.entity.Reserva;

import java.time.LocalDate;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
	List<Reserva> findByCliente(Cliente cliente);

	List<Reserva> findByDataReservaAndNumeroMesa(LocalDate dataReserva, Integer numeroMesa);
}
