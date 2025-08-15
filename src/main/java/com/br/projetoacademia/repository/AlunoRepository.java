package com.br.projetoacademia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.projetoacademia.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
