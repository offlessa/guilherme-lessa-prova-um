package com.triersistemas.guilherme_lessa_prova1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triersistemas.guilherme_lessa_prova1.entity.RestauranteEntity;

@Repository
public interface RestauranteRepository extends JpaRepository<RestauranteEntity, Long> {

}