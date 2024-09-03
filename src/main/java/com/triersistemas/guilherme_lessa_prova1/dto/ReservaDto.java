package com.triersistemas.guilherme_lessa_prova1.dto;

import com.triersistemas.guilherme_lessa_prova1.enums.StatusReservaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservaDto {
	private Long id;
	private Long clienteId;
	private Long mesaId;
	private LocalDate dataReserva;
	private int quantidadePessoas;
	private StatusReservaEnum status;
	private String observacao;

}
