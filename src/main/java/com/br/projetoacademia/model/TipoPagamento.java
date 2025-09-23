package com.br.projetoacademia.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TipoPagamento {
	
    PIX("PIX"),
    CARTAO_CREDITO("Cartão de Crédito"),
    CARTAO_DEBITO("Cartão de débito"),
    DINHEIRO("Dinheiro");

    private final String descricao;

    private TipoPagamento(String descricao) {
        this.descricao = descricao;
    }
    
    @JsonValue
    public String getDescricao() {
        return descricao;
    }
}
