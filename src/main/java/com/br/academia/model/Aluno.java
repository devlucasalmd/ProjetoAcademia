package com.br.academia.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {

	private Long id;
	private String nome;
	private LocalDate dataNasc;
	private String cpf;
	private Genero genero	;
	private String Telefone;
	private String email;
	private Boolean ativo;
	private Endereco endereco;
	private Matricula matricula;
}
