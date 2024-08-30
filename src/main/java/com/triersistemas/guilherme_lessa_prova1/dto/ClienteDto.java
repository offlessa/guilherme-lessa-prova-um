package com.triersistemas.guilherme_lessa_prova1.dto;

import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDto {
	private Long id;
	private String nome;
	private String email;
	private Long reservaId;

	public ClienteDto(ClienteEntity entity) {
		this.id = entity.getId();
		this.nome = entity.getNome();
		this.email = entity.getEmail();
		if (entity.getReserva() != null) {
			this.reservaId = entity.getReserva().getId();
		}
	}

}
