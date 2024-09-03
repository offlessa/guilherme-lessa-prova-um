package com.triersistemas.guilherme_lessa_prova1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("CLIENTE")
public class ClienteEntity extends PessoaEntity {
	@Column(name = "data_cadastro")
	private LocalDate dataCadastro;

	@Column(name = "quantidade_reservas")
	private int quantidadeReservas;

	@Column(name = "quantidade_valor_gasto")
	private double quantidadeValorGasto;

	@Column(name = "flg_bloqueado")
	private boolean flgBloqueado;

}
