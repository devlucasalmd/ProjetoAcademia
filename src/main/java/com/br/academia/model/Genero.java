package com.br.academia.model;

import lombok.Getter;

@Getter
public enum Genero {

	MASCULINO("Masculino"),
	FEMININO("Feminino"),
	OUTRO("Outro"),
	PREFIRO_NAO_DIZER("Prefiro não dizer");
	
	private String descricao;
	
	private Genero(String descricao) {
		this.descricao = descricao; 
	}
}
