package com.projetoemprestimo.projeto.controller;

import com.projetoemprestimo.projeto.dto.SimulacaoRequest;
import com.projetoemprestimo.projeto.dto.SimulacaoResponse;
import com.projetoemprestimo.projeto.service.SimuladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/simulador")
public class SimuladorController {

    @Autowired
    private SimuladorService simuladorService;

    @PostMapping
    public ResponseEntity<SimulacaoResponse> simular(@RequestBody SimulacaoRequest request) {
        SimulacaoResponse response = simuladorService.simularEmprestimo(request);
        return ResponseEntity.ok(response);
    }
}