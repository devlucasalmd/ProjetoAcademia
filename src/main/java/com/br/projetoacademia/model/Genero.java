package com.br.projetoacademia.model;

public enum Genero {

	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");

	private final String descricao;

	private Genero(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
