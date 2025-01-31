package com.projetoemprestimo.projeto.service;

import com.projetoemprestimo.projeto.model.Simulacao;
import com.projetoemprestimo.projeto.repository.SimulacaoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@SpringBootTest
class SimuladorServiceTest {
/*
    @Mock
    private SimulacaoRepository simulacaoRepository;

    @InjectMocks
    private com.exemplo.simuladorcredito.service.SimuladorService simuladorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCalcularJuros() {
        Simulacao simulacao = new Simulacao();
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1)); // 33 anos

        double juros = simuladorService.calcularJuros(simulacao);
        assertEquals(0.03, juros); // Taxa esperada para 26-40 anos
    }

    @Test
    void testCalcularParcelaMensal() {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1)); // 33 anos
        simulacao.setPrazoMeses(12);

        double parcelaMensal = simuladorService.calcularParcelaMensal(simulacao);
        assertEquals(856.07, parcelaMensal, 0.01); // Valor esperado com margem de erro
    }

    @Test
    void testCalcularTotalJuros() {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1)); // 33 anos
        simulacao.setPrazoMeses(12);

        double totalJuros = simuladorService.calcularTotalJuros(simulacao);
        assertEquals(272.84, totalJuros, 0.01); // Valor esperado com margem de erro
    }

    @Test
    void testSalvarSimulacao() {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1)); // 33 anos
        simulacao.setPrazoMeses(12);

        when(simulacaoRepository.save(any(Simulacao.class))).thenAnswer(invocation -> {
            Simulacao sim = invocation.getArgument(0);
            sim.setId(1L); // Simula a geração do ID
            return sim;
        });

        Simulacao resultado = simuladorService.salvarSimulacao(simulacao);

        assertEquals(1L, resultado.getId());
        assertEquals(10272.84, resultado.getValorTotalPago(), 0.01);
        assertEquals(856.07, resultado.getValorParcelaMensal(), 0.01);
        assertEquals(272.84, resultado.getTotalJurosPagos(), 0.01);

        verify(simulacaoRepository, times(1)).save(any(Simulacao.class));
    }

 */
}