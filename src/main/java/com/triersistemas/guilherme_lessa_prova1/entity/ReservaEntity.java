package com.triersistemas.guilherme_lessa_prova1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

import com.triersistemas.guilherme_lessa_prova1.enums.StatusReservaEnum;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class ReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "mesa_id", nullable = false)
    private MesaEntity mesa;

    @Column(name = "data_reserva", nullable = false)
    private LocalDate dataReserva;

    @Column(name = "quantidade_pessoas", nullable = false)
    private int quantidadePessoas;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusReservaEnum status;

    private String observacao;

}



