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
import com.br.projetoacademia.dto.MatriculaRequestDTO;
import com.br.projetoacademia.dto.MatriculaResponseDTO;
import com.br.projetoacademia.service.MatriculaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
	
	private final MatriculaService matriculaService;

	
	public MatriculaController(MatriculaService matriculaService) {
		this.matriculaService = matriculaService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MatriculaResponseDTO createMatricula(@Valid @RequestBody MatriculaRequestDTO matriculaRequest) {
		return matriculaService.criarMatricula(matriculaRequest);
	}
	
	@GetMapping
	public List<MatriculaResponseDTO> findAllMatricula(){
		return matriculaService.listarMatriculas();
	}

	@GetMapping("/{id}")
	public MatriculaResponseDTO findByIdMatricula(@PathVariable Long id) {
		return matriculaService.buscarPorId(id);
	}
	
	@PutMapping("/{id}")
	public MatriculaResponseDTO updateMatricula(@PathVariable Long id, @Valid @RequestBody MatriculaRequestDTO matriculaRequest) {
		return matriculaService.atualizarMatricula(id, matriculaRequest);
	}	

//	@DeleteMapping("/{id}")
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void deactivateMatricula(@PathVariable Long id) { 
//		matriculaService.desativarMatricula(id); 
//	}
}
