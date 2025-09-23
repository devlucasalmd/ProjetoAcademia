package com.br.projetoacademia.dto;

import java.time.LocalDate;

import java.util.List;

import com.br.projetoacademia.model.StatusMatricula;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

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
    private Long planoId;

    private List<Long> pagamentosIds;

}
