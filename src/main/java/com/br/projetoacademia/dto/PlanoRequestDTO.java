package com.br.projetoacademia.dto;


import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlanoRequestDTO {

	@NotBlank(message = "O nome do plano é obrigatório")
	@Size(min = 3, max = 50, message = "O nome do plano deve ter entre 3 e 50 caracteres")
	private String nomePlano;

	@NotNull(message = "O valor do plano é obrigatório")
	private BigDecimal valorPlano;

	@NotNull(message = "A duração em dias é obrigatória")
	private Integer duracaoDias;

	@Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
	private String descricao;
}