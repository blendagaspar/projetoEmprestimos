package com.exemplo.simuladorcredito.service;


import com.projetoemprestimo.projeto.model.Simulacao;
import com.projetoemprestimo.projeto.repository.SimulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;

@Service
public class SimuladorService {

    @Autowired
    private SimulacaoRepository simulacaoRepository;

    public double calcularJuros(Simulacao simulacao) {
        int idade = calcularIdade(simulacao.getDataNascimento());
        if (idade <= 25) {
            return 0.05;
        } else if (idade <= 40) {
            return 0.03;
        } else if (idade <= 60) {
            return 0.02;
        } else {
            return 0.04;
        }
    }

    public double calcularParcelaMensal(Simulacao simulacao) {
        double jurosAnual = calcularJuros(simulacao);
        double jurosMensal = jurosAnual / 12;
        double valorEmprestimo = simulacao.getValorEmprestimo();
        int prazoMeses = simulacao.getPrazoMeses();

        double pmt = (valorEmprestimo * jurosMensal) / (1 - Math.pow(1 + jurosMensal, -prazoMeses));
        return pmt;
    }

    public double calcularTotalJuros(Simulacao simulacao) {
        double parcelaMensal = calcularParcelaMensal(simulacao);
        return (parcelaMensal * simulacao.getPrazoMeses()) - simulacao.getValorEmprestimo();
    }

    private int calcularIdade(LocalDate dataNascimento) {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public Simulacao salvarSimulacao(Simulacao simulacao) {
        double parcelaMensal = calcularParcelaMensal(simulacao);
        double totalJuros = calcularTotalJuros(simulacao);
        double totalPago = parcelaMensal * simulacao.getPrazoMeses();

        simulacao.setValorParcelaMensal(parcelaMensal);
        simulacao.setTotalJurosPagos(totalJuros);
        simulacao.setValorTotalPago(totalPago);

        return simulacaoRepository.save(simulacao);
    }
}