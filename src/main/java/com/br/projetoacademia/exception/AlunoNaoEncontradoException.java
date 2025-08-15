package com.br.projetoacademia.exception;

public class AlunoNaoEncontradoException extends RuntimeException{

	public AlunoNaoEncontradoException(Long id) {
		super("Aluno com ID: " + id + " não encontrado.");
	}
}
