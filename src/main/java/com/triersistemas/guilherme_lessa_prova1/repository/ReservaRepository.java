package com.triersistemas.guilherme_lessa_prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triersistemas.guilherme_lessa_prova1.entity.ReservaEntity;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {
	List<ReservaEntity> findByClienteId(Long clienteId);

	boolean existsByDataReservaAndNumeroMesa(LocalDate dataReserva, Integer numeroMesa);
}
