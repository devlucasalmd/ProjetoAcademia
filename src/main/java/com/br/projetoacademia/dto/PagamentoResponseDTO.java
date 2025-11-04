package com.br.projetoacademia.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.br.projetoacademia.model.Matricula;
import com.br.projetoacademia.model.StatusPagamento;
import com.br.projetoacademia.model.TipoPagamento;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagamentoResponseDTO {

	private Long id;	
	private Double valorPago;	   	
	private TipoPagamento tipoPagamento;	
	private LocalDate dataPagamento;
	private StatusPagamento statusPagamento;
	private Matricula matricula;

}
