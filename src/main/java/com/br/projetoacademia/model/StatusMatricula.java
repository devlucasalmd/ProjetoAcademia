package com.br.projetoacademia.model;

public enum StatusMatricula {

    ATIVA("Ativa"),
    INATIVA("Inativa"),
    CANCELADA("Cancelada"),
    PENDENTE("Pendente");

    private final String descricao;

    private StatusMatricula(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}