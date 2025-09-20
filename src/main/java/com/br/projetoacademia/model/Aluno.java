package com.br.projetoacademia.model;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "alunos")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(min = 3, max = 50)
	@Column(nullable = false, length = 50)
	private String nome;
	
	@NotBlank
	@Email
	@Column(nullable = false, length = 100)
	private String email;
		
	@NotBlank
	@Size(min = 8, max = 16)
	@Column(nullable = false, length = 255)
	private String senha;
	
	@NotBlank
//	@CPF
	@Column(nullable = false, unique = true, length = 14)
	private String cpf;
	
	@NotNull
	@Column(name = "data_nascimento", nullable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataNascimento;
	
	@NotBlank
	@Column(nullable = false, length = 20)
	private String telefone;
	
	@NotNull
	private Boolean ativo;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "genero_enum", nullable = false)
	private Genero genero;
	
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Matricula> matriculas;
}
