package com.triersistemas.guilherme_lessa_prova1.entity;

import java.util.Set;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
@Entity(name = "cliente")
public class ClienteEntity {

	@Entity
	public class Cliente {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private String nome;

	    @Column(nullable = false, unique = true)
	    private String email;

	    @OneToMany(mappedBy = "cliente")
	    private Set<Reserva> reservas;

	}
}
