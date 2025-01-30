package com.projetoemprestimo.projeto.controller;

import com.projetoemprestimo.projeto.model.Simulacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/simulador")
public class SimuladorController {

    @Autowired
    private com.exemplo.simuladorcredito.service.SimuladorService simuladorService;

    @PostMapping("/simular")
    public Map<String, Double> simularEmprestimo(@RequestBody Simulacao simulacao) {
        double parcelaMensal = simuladorService.calcularParcelaMensal(simulacao);
        double totalJuros = simuladorService.calcularTotalJuros(simulacao);
        double totalPago = parcelaMensal * simulacao.getPrazoMeses();

        Map<String, Double> resultado = new HashMap<>();
        resultado.put("valorTotalPago", totalPago);
        resultado.put("valorParcelaMensal", parcelaMensal);
        resultado.put("totalJurosPagos", totalJuros);

        return resultado;
    }
}
