package com.projetoemprestimo.projeto.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class SimulacaoResponse {
    private double valorEmprestimo;
    private LocalDate dataNascimento;
    private int prazoMeses;
    private double taxaJurosAnual;
    private double valorTotalPago;
    private double parcelaMensal;
    private double totalJuros;

    public SimulacaoResponse(double valorEmprestimo, LocalDate dataNascimento, int prazoMeses, double taxaJurosAnual, double valorTotalPago, double parcelaMensal, double totalJuros) {
        this.valorEmprestimo = valorEmprestimo;
        this.dataNascimento = dataNascimento;
        this.prazoMeses = prazoMeses;
        this.taxaJurosAnual = taxaJurosAnual;
        this.valorTotalPago = valorTotalPago;
        this.parcelaMensal = parcelaMensal;
        this.totalJuros = totalJuros;
    }

}
