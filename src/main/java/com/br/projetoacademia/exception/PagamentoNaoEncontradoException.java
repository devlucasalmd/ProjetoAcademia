package com.br.projetoacademia.exception;

public class PagamentoNaoEncontradoException extends RuntimeException{

	public PagamentoNaoEncontradoException(Long id) {
		super("Pagamento com ID: " + id + " não encontrado.");
	}
}
