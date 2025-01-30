package com.projetoemprestimo.projeto.controller;

import com.projetoemprestimo.projeto.model.Simulacao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@WebMvcTest(SimuladorController.class)
public class SimuladorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private com.exemplo.simuladorcredito.service.SimuladorService simuladorService;

    @Test
    public void testSimularEmprestimo() throws Exception {
        Simulacao simulacao = new Simulacao();
        simulacao.setValorEmprestimo(10000);
        simulacao.setDataNascimento(LocalDate.of(1990, 1, 1));
        simulacao.setPrazoMeses(12);

        when(simuladorService.calcularParcelaMensal(any(Simulacao.class))).thenReturn(856.07);
        when(simuladorService.calcularTotalJuros(any(Simulacao.class))).thenReturn(272.84);

    }

}