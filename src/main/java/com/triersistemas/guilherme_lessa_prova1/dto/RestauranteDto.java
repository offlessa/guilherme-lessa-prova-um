package com.triersistemas.guilherme_lessa_prova1.dto;

import com.triersistemas.guilherme_lessa_prova1.enums.TipoComidaEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestauranteDto {

	private Long id;
	private String nome;
	private String cnpj;
	private double estrelas;
	private TipoComidaEnum tipoComida;
}
