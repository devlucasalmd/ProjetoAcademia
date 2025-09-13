package com.br.projetoacademia.model;

public enum TipoPagamento {
	
    PIX("PIX"),
    CARTAO_CREDITO("Cartão de Crédito"),
    CARTAO_DEBITO("Cartão de débito"),
    DINHEIRO("Dinheiro");

    private final String descricao;

    private TipoPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
