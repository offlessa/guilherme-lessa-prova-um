package com.triersistemas.guilherme_lessa_prova1.entity;

import com.triersistemas.guilherme_lessa_prova1.enums.TipoComidaEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RestauranteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String cnpj;

	@Column(nullable = false)
	private int estrelas;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private TipoComidaEnum tipoComida;
}