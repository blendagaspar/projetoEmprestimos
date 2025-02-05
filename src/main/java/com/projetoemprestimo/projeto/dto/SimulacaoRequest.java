package com.projetoemprestimo.projeto.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SimulacaoRequest {
    private double valorEmprestimo;
    private LocalDate dataNascimento;
    private int prazoMeses;
}