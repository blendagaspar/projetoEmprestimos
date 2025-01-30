package com.projetoemprestimo.projeto.service;

import com.projetoemprestimo.projeto.model.Simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SimuladorServiceTest {

    @Autowired
    private SimuladorService simuladorService;

    @Test
    public void testCalcularJuros() {
        Simulacao simulacao = new Simulacao();
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1));

        double juros = simuladorService.calcularJuros(simulacao);
        assertEquals(0.03, juros);
    }

    @Test
    public void testCalcularParcelaMensal() {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1));
        simulacao.setPrazoMeses(12);

        double parcelaMensal = simuladorService.calcularParcelaMensal(simulacao);
        assertEquals(846.9369875849058, parcelaMensal, 0.01);
    }

    @Test
    public void testCalcularTotalJuros() {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1));
        simulacao.setPrazoMeses(12);

        double totalJuros = simuladorService.calcularTotalJuros(simulacao);
        assertEquals(163.24385101886946, totalJuros, 0.01);
    }

}