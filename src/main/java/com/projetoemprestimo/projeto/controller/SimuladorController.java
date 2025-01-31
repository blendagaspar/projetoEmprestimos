package com.projetoemprestimo.projeto.controller;

import com.projetoemprestimo.projeto.model.Simulacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulador")
public class SimuladorController {


    @Autowired
    private com.exemplo.simuladorcredito.service.SimuladorService simuladorService;

    @PostMapping("/simular")
    public Simulacao simularEmprestimo(@RequestBody Simulacao simulacao) {
        return simuladorService.salvarSimulacao(simulacao);
    }
}
