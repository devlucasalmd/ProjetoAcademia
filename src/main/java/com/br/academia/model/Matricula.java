package com.br.academia.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Matricula {

	private Long id;
	private LocalDate dataMatricula;
	private LocalDate dataFimMatricula;
	private Plano plano;
	private Pagamento pagamento;
	
}
