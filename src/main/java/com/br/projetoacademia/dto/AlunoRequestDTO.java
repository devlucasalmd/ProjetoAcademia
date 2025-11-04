package com.br.projetoacademia.dto;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import com.br.projetoacademia.model.Genero;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AlunoRequestDTO {

	@NotBlank(message = "O nome é obrigatório")
	@Size(min = 3, max = 50, message = "O nome deve ter entre 3 e 50 caracteres")
	private String nome;

	@NotBlank(message = "O email é obrigatório")
	@Email(message = "Email inválido")
	private String email;

	@NotBlank(message = "A senha é obrigatória")
	@Size(min = 8, max = 16, message = "A senha deve ter entre 8 e 16 caracteres")
	private String senha;

	@NotBlank(message = "O CPF é obrigatório")
	//    @CPF
	private String cpf;

	@NotNull(message = "A data de nascimento é obrigatória")
	private LocalDate dataNascimento;

	@NotBlank(message = "O telefone é obrigatório")
	private String telefone;

	@NotNull(message = "O status ativo é obrigatório")
	private Boolean ativo;

	@NotNull(message = "O gênero é obrigatório")
	private Genero genero;
}
