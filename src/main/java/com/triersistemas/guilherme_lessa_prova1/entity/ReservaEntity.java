package com.triersistemas.guilherme_lessa_prova1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

import com.triersistemas.guilherme_lessa_prova1.enums.StatusEnum;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "reserva")
public class ReservaEntity {

    public enum Status {
        FEITA, CONCLUIDA, CANCELADA
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private LocalDate dataReserva;

    @Column(nullable = false)
    private Integer numeroPessoas;

    @Column(nullable = false)
    private Integer numeroMesa;

    @Enumerated(EnumType.ORDINAL)
    @Column(nullable = false)
    private Status status = Status.FEITA;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity cliente;

	public void setStatus(StatusEnum status2) {
		
	}
}



