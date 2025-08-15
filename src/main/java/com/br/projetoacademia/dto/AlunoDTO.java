package com.br.projetoacademia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDTO {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private LocalDate dataNasc;
	private String telefone;
	private Boolean ativo;		
	
}
