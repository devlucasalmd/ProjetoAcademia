package com.br.academia.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco {

	private String cep;
	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
}
