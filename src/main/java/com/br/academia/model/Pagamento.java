package com.br.academia.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagamento {

	private Long id;
	private TipoPagamento tipoPagamento;
	private LocalDate dataPagamento;
}

