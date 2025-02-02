package com.projetoemprestimo.projeto.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.time.LocalDate;

@Data
@Document(collection = "simulacoes")
public class Simulacao {

    @Id
    private Long id;

    private double valorEmprestimo;
    private LocalDate dataNascimento;
    private int prazoMeses;
    private double valorTotalPago;
    private double valorParcelaMensal;
    private double totalJurosPagos;
}
