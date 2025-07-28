package com.br.academia.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Endereco {

	private String cep;
	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
}
