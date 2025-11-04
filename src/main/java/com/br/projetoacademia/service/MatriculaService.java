package com.br.projetoacademia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projetoacademia.dto.MatriculaRequestDTO;
import com.br.projetoacademia.dto.MatriculaResponseDTO;
import com.br.projetoacademia.mapper.MatriculaMapper;
import com.br.projetoacademia.model.Matricula;
import com.br.projetoacademia.repository.MatriculaRepository;

@Service
public class MatriculaService {

	@Autowired
	private final MatriculaRepository matriculaRepository;
	
	@Autowired	
	private final MatriculaMapper matriculaMapper;
	
	public MatriculaService(MatriculaRepository matriculaRepository, MatriculaMapper matriculaMapper) {
		this.matriculaRepository = matriculaRepository;
		this.matriculaMapper = matriculaMapper;
	}
	
	public MatriculaResponseDTO criarMatricula(MatriculaRequestDTO dto) {
		Matricula matricula = matriculaMapper.toEntity(dto);
		Matricula matriculaSalva = matriculaRepository.save(matricula);
		
		return matriculaMapper.toResponseDTO(matriculaSalva);
	}
	
	
}
