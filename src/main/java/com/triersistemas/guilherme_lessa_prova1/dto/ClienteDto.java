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
	
	public ClienteDto(ClienteEntity entity) {
		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
	}
}