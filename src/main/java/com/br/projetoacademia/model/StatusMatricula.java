package com.br.projetoacademia.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum StatusMatricula {

	ATIVA("Ativa"),
	CANCELADA("Cancelada"),
	PENDENTE("Pendente"),
	EXPIRADA("Expirada");

	private final String descricao;

	private StatusMatricula(String descricao) {
		this.descricao = descricao;
	}

	@JsonValue
	public String getDescricao() {
		return descricao;
	}
}