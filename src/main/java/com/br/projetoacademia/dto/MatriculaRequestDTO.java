package com.br.projetoacademia.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.br.projetoacademia.model.Genero;
import com.br.projetoacademia.model.Plano;
import com.br.projetoacademia.model.StatusMatricula;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatriculaRequestDTO {

	@NotNull(message = "A data de início da matrícula é obrigatória")
	private LocalDate dataInicioMatricula;

	@NotNull(message = "A data de fim da matrícula é obrigatória")
	@Future(message = "A data de fim deve ser no futuro")
	private LocalDate dataFimMatricula;

	@NotNull(message = "O status da matrícula é obrigatório")
	private StatusMatricula status;

	@NotNull(message = "O ID do aluno é obrigatório")
	private Long alunoId;

	@NotNull(message = "O ID do plano é obrigatório")
	private Plano planoId;

	private List<Long> pagamentosIds;
	
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAtualizacao;

}
