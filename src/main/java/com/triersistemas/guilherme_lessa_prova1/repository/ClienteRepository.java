package com.triersistemas.guilherme_lessa_prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    // Additional query methods
}
