package com.triersistemas.guilherme_lessa_prova1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PedidoDto {

	private Long id;
	private Long reservaId;
	private String descricao;
	private double valor;
}
