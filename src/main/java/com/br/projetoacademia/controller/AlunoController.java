package com.br.projetoacademia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.projetoacademia.dto.AlunoDTO;
import com.br.projetoacademia.model.Aluno;
import com.br.projetoacademia.service.AlunoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	private final AlunoService alunoService;


	public AlunoController(AlunoService alunoService) {
		this.alunoService = alunoService;	
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AlunoDTO createAluno(@Valid @RequestBody Aluno aluno) { return alunoService.criarAluno(aluno); }
	
	@GetMapping
	public List<AlunoDTO> readAluno(){ return alunoService.listarAlunos(); }
	
	@GetMapping("/{id}")
	public AlunoDTO readAlunoById(@PathVariable Long id) { return alunoService.buscarPorId(id);	}
	
	@PutMapping("/{id}")
	public AlunoDTO updateAluno(@PathVariable Long id, @Valid @RequestBody Aluno aluno){ return alunoService.atualizarAluno(id, aluno);	}
		
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteAluno(@PathVariable Long id) { alunoService.desativarAluno(id); }
}
