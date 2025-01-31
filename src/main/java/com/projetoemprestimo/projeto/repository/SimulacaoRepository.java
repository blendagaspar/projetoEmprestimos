package com.projetoemprestimo.projeto.repository;

import com.projetoemprestimo.projeto.model.Simulacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SimulacaoRepository extends JpaRepository<Simulacao, Long> {
}
