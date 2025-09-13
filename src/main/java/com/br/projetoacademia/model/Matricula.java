package com.br.projetoacademia.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matriculas")
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Column(name = "data_inicio_matricula", nullable = false)
	private LocalDate dataInicioMatricula;
	
	@NotBlank
	@Column(name = "data_fim_matricula", nullable = false)
	private LocalDate dataFimMatricula;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private StatusMatricula status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "aluno_id", nullable = false)
	private Aluno aluno;
	
	@NotBlank
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plano_id", nullable = false)
	private Plano plano;
	
	
}
