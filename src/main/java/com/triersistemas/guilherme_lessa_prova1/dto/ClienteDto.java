package com.triersistemas.guilherme_lessa_prova1.dto;

import java.time.LocalDate;
import com.triersistemas.guilherme_lessa_prova1.enums.SexoEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDto {
	private Long id;
	private String nome;
	private String cpf;
	private String sobrenome;
	private LocalDate dataNascimento;
	private SexoEnum sexo;
	private String telefone;
	private LocalDate dataCadastro;
	private int quantidadeReservas;
	private double quantidadeValorGasto;
	private boolean flgBloqueado;

}
