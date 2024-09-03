package com.triersistemas.guilherme_lessa_prova1.service;

import java.util.List;

import com.triersistemas.guilherme_lessa_prova1.dto.RestauranteDto;

public interface RestauranteService {
    RestauranteDto criarRestaurante(RestauranteDto restauranteDto);
    RestauranteDto atualizarRestaurante(Long id, RestauranteDto restauranteDto);
    RestauranteDto buscarRestaurante(Long id);
    List<RestauranteDto> listarRestaurantes();
}