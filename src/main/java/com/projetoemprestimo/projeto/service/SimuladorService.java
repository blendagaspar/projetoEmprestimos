package com.projetoemprestimo.projeto.service;

import com.projetoemprestimo.projeto.dto.SimulacaoRequest;
import com.projetoemprestimo.projeto.dto.SimulacaoResponse;
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

    public SimulacaoResponse simularEmprestimo(SimulacaoRequest request) {
        int idade = Period.between(request.getDataNascimento(), LocalDate.now()).getYears();
        double taxaAnual = determinarTaxaJuros(idade);
        double taxaMensal = taxaAnual / 12 / 100;

        double pmt = (request.getValorEmprestimo() * taxaMensal) / (1 - Math.pow(1 + taxaMensal, -request.getPrazoMeses()));
        double valorTotalPago = pmt * request.getPrazoMeses();
        double totalJuros = valorTotalPago - request.getValorEmprestimo();

        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(request.getValorEmprestimo());
        simulacao.setDataNascimento(request.getDataNascimento());
        simulacao.setPrazoMeses(request.getPrazoMeses());
        simulacao.setTaxaJurosAnual(taxaAnual);
        simulacao.setParcelaMensal(pmt);
        simulacao.setValorTotalPago(valorTotalPago);
        simulacao.setTotalJuros(totalJuros);

        simulacaoRepository.save(simulacao);

        return new SimulacaoResponse(
                request.getValorEmprestimo(),
                request.getDataNascimento(),
                request.getPrazoMeses(),
                taxaAnual,
                valorTotalPago,
                pmt,
                totalJuros
        );
    }

    private double determinarTaxaJuros(int idade) {
        if (idade <= 25) return 5.0;
        if (idade <= 40) return 3.0;
        if (idade <= 60) return 2.0;
        return 4.0;
    }
}