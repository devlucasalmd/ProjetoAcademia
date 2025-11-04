package com.br.projetoacademia.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.br.projetoacademia.model.Aluno;
import com.br.projetoacademia.model.Genero;
import com.br.projetoacademia.model.Pagamento;
import com.br.projetoacademia.model.Plano;
import com.br.projetoacademia.model.StatusMatricula;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatriculaResponseDTO {

	private Long id;
	private LocalDate dataInicioMatricula;
	private LocalDate dataFimMatricula;
	private StatusMatricula status;
	private AlunoResponseDTO aluno;
	private PlanoResponseDTO plano;
	private List<PagamentoResponseDTO> pagamentos;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;
}
