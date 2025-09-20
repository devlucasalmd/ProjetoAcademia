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

import com.br.projetoacademia.dto.AlunoRequestDTO;
import com.br.projetoacademia.dto.AlunoResponseDTO;
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
	public AlunoResponseDTO createAluno(@Valid @RequestBody AlunoRequestDTO alunoRequest) { 
		return alunoService.criarAluno(alunoRequest); 
	}
	
	@GetMapping
	public List<AlunoResponseDTO> findAllAluno(){ 
		return alunoService.listarAlunos(); 
	}
	
	@GetMapping("/{id}")
	public AlunoResponseDTO findByIdAluno(@PathVariable Long id) { 
		return alunoService.buscarPorId(id);	
	}
	
	@PutMapping("/{id}")
	public AlunoResponseDTO updateAluno(@PathVariable Long id, @Valid @RequestBody AlunoRequestDTO alunoRequest){
		return alunoService.atualizarAluno(id, alunoRequest);	
	}
		
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deactivateAluno(@PathVariable Long id) { 
		alunoService.desativarAluno(id); 
	}
}
