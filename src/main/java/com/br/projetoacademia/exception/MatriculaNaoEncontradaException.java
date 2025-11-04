package com.br.projetoacademia.exception;

public class MatriculaNaoEncontradaException extends RuntimeException{
	
	public MatriculaNaoEncontradaException(Long id) {
		super("Matricula com ID: " + id + " não encontrado.");
	}
}
