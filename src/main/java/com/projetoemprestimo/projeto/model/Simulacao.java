package com.projetoemprestimo.projeto.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Data
public class Simulacao {

    private double valorEmprestimo;
    private LocalDate dataNascimento;
    private int prazoMeses;
}
