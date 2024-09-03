package com.triersistemas.guilherme_lessa_prova1.entity;

import com.triersistemas.guilherme_lessa_prova1.enums.SexoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

public abstract class PessoaEntity {

	@Entity
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Table(name = "pessoas")
	@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
	@DiscriminatorColumn(name = "pessoa_tipo")
	public abstract class Pessoa {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;

		@Column(nullable = false)
		private String nome;

		@Column(nullable = false, unique = true)
		private String cpf;

		@Column(nullable = false)
		private String sobrenome;

		@Column(name = "data_nascimento", nullable = false)
		private LocalDate dataNascimento;

		@Enumerated(EnumType.STRING)
		@Column(nullable = false)
		private SexoEnum sexo;

		@Column(nullable = false)
		private String telefone;

	}
}