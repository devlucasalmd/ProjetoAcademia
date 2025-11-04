package com.br.projetoacademia.dto;

import java.time.LocalDate;

import com.br.projetoacademia.model.StatusPagamento;
import com.br.projetoacademia.model.TipoPagamento;

import jakarta.validation.constraints.NotNull;

public class PagamentoRequestDTO {

	@NotNull(message = "O valor do pagamento é obrigatório")
	private Double valorPago;

	@NotNull(message = "O tipo de pagamento é obrigatório")
	private TipoPagamento tipoPagamento;

	@NotNull(message = "A data do pagamento é obrigatória")
	private LocalDate dataPagamento;

	@NotNull(message = "O status do pagamento é obrigatório")
	private StatusPagamento statusPagamento;

	@NotNull(message = "O id da matrícula é obrigatório")
	private Long matriculaId;
}