package com.br.projetoacademia.exception;

public class PlanoNaoEncontradoException extends RuntimeException{

	public PlanoNaoEncontradoException(Long id) {
		super("Plano com ID: " + id + " não encontrado.");
	}
}
