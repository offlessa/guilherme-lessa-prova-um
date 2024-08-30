package com.triersistemas.guilherme_lessa_prova1.entity;

import java.time.LocalDate;


import com.triersistemas.guilherme_lessa_prova1.entity.ClienteEntity.Cliente;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "reserva")

public class Reserva {

	public enum Status {
		FEITA, CONCLUIDA, CANCELADA
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private LocalDate dataReserva;

	@Column(nullable = false)
	private Integer numeroPessoas;

	@Column(nullable = false)
	private Integer numeroMesa;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status = Status.FEITA;

	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;

	public void setCliente(Cliente cliente2) {
		
		
	}

	public void setStatus(Status status2) {
		
		
	}

}
