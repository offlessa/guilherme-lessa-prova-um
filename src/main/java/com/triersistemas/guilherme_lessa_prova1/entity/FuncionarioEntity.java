package com.triersistemas.guilherme_lessa_prova1.entity;

import java.time.LocalDate;

import com.triersistemas.guilherme_lessa_prova1.enums.CargoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DiscriminatorValue("FUNCIONARIO")
public class FuncionarioEntity extends PessoaEntity {
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CargoEnum cargo;

    @Column(name = "data_admissao", nullable = false)
    private LocalDate dataAdmissao;

    @Column(nullable = false)
    private double salario;

    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;

}
