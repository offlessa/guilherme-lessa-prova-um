package com.triersistemas.guilherme_lessa_prova1.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triersistemas.guilherme_lessa_prova1.entity.PedidoEntity;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {
    List<PedidoEntity> findByDataBetween(LocalDate startDate, LocalDate endDate);

}