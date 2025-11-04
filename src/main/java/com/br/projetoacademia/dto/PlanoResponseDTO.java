package com.br.projetoacademia.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanoResponseDTO {

	private Long id;
	private String nomePlano;
	private BigDecimal valorPlano;
	private Integer duracaoDias;
	private String descricao;
}
