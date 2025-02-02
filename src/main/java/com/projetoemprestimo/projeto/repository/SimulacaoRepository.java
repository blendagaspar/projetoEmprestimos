package com.projetoemprestimo.projeto.repository;

import com.projetoemprestimo.projeto.model.Simulacao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SimulacaoRepository extends MongoRepository<Simulacao, String> {

}
