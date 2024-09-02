package com.triersistemas.guilherme_lessa_prova1.dto;

import com.triersistemas.guilherme_lessa_prova1.entity.ReservaEntity;
import com.triersistemas.guilherme_lessa_prova1.enums.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReservaDto {
    private Long id;
    private LocalDate dataReserva;
    private Integer numeroPessoas;
    private Integer numeroMesa;
    private StatusEnum status;
    private ClienteDto cliente;
    private String nomeCliente;
    private Long idCliente;

    public ReservaDto(ReservaEntity entity) {
        id = entity.getId();
        dataReserva = entity.getDataReserva();
        numeroPessoas = entity.getNumeroPessoas();
        numeroMesa = entity.getNumeroMesa();
        status = StatusEnum.valueOf(entity.getStatus().name());
        cliente = new ClienteDto(entity.getCliente());
    }

    public ReservaDto(ReservaEntity entity, String nome) {
        this(entity);
        this.nomeCliente = nome;
    }

    public ReservaDto(ReservaEntity entity, Long idCl) {
        this(entity);
        this.idCliente = idCl;
    }

}
