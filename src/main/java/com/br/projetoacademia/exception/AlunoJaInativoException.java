	package com.br.projetoacademia.exception;

public class AlunoJaInativoException extends RuntimeException{
    public AlunoJaInativoException(Long id) {
        super("Aluno com ID " + id + " já está inativo.");
    }
	
}
