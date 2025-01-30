package com.projetoemprestimo.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Simulacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valorEmprestimo;
    private LocalDate dataNascimento;
    private int prazoMeses;
    private double valorTotalPago;
    private double valorParcelaMensal;
    private double totalJurosPagos;
}
