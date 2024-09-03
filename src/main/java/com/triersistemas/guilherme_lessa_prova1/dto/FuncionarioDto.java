package com.triersistemas.guilherme_lessa_prova1.dto;

import java.time.LocalDate;
import com.triersistemas.guilherme_lessa_prova1.enums.CargoEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FuncionarioDto {
	private Long id;
	private CargoEnum cargo;
	private LocalDate dataAdmissao;
	private double salario;
	private int cargaHoraria;
}
