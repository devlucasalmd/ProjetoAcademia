package com.br.projetoacademia.model;

public enum StatusPagamento {

    PENDENTE("Pendente"),
    PAGO("Pago"),
    CANCELADO("Cancelado"),
    ESTORNADO("Estornado");

    private final String descricao;

    private StatusPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
