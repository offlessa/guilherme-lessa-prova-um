package com.triersistemas.guilherme_lessa_prova1.dto;

import java.time.LocalDate;

import com.triersistemas.guilherme_lessa_prova1.enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReservaDto {
	
	private Long id;
	private LocalDate dataReserva;
	private int numeroPessoas;
	private int numeroMesa;
	private StatusEnum status;
}
