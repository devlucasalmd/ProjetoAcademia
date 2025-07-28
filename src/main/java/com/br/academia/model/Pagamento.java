package com.br.academia.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pagamento {

	private Long id;
	private TipoPagamento tipoPagamento;
	private LocalDate dataPagamento;
}

