package com.br.projetoacademia.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusPagamento {

	PENDENTE("Pendente"),
	PAGO("Pago"),
	CANCELADO("Cancelado"),
	ESTORNADO("Estornado");

	private final String descricao;

	private StatusPagamento(String descricao) {
		this.descricao = descricao;
	}

	@JsonValue
	public String getDescricao() {
		return descricao;
	}
}
