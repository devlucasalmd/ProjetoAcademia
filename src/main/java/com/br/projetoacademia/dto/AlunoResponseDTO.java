package com.br.projetoacademia.dto;

import java.time.LocalDate;

import com.br.projetoacademia.model.Genero;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlunoResponseDTO {

	private Long id;
	private String nome;
	private String email;
	private String cpf;
	private LocalDate dataNascimento;
	private String telefone;
	private Boolean ativo;
	private Genero genero;
}
