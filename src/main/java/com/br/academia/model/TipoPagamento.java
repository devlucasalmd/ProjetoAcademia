package com.br.academia.model;

public enum TipoPagamento {
	
	PIX("Pix"),
	DEBITO("Débito"),
	CREDITO("Creédito"),
	BOLETO("Boleto"),
	DINHEIRO("Dinheiro");

	private String descricao;

	private TipoPagamento(String descricao) {
		this.descricao = descricao; 
	}
}
