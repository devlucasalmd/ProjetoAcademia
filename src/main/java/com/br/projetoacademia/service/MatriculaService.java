package com.br.projetoacademia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projetoacademia.dto.AlunoRequestDTO;
import com.br.projetoacademia.dto.AlunoResponseDTO;
import com.br.projetoacademia.dto.MatriculaRequestDTO;
import com.br.projetoacademia.dto.MatriculaResponseDTO;
import com.br.projetoacademia.exception.AlunoJaInativoException;
import com.br.projetoacademia.exception.AlunoNaoEncontradoException;
import com.br.projetoacademia.exception.MatriculaNaoEncontradaException;
import com.br.projetoacademia.mapper.MatriculaMapper;
import com.br.projetoacademia.model.Aluno;
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
	
	public List<MatriculaResponseDTO> listarMatriculas(){
		return matriculaRepository.findAll()
				.stream()
				.map(matriculaMapper::toResponseDTO)
				.toList();
	}
	
	public MatriculaResponseDTO buscarPorId(Long id) {
		Matricula matricula = buscarMatriculaPorId(id);
		return matriculaMapper.toResponseDTO(matricula);
	}


	public MatriculaResponseDTO atualizarMatricula(Long id, MatriculaRequestDTO novaMatricula) {
		Matricula matriculaExistente = buscarMatriculaPorId(id);
		
		matriculaExistente.setDataInicioMatricula(novaMatricula.getDataInicioMatricula());
		matriculaExistente.setDataFimMatricula(novaMatricula.getDataFimMatricula());	
		matriculaExistente.setStatus(novaMatricula.getStatus());
		matriculaExistente.setDataCriacao(novaMatricula.getDataCriacao());
		matriculaExistente.setDataAtualizacao(novaMatricula.getDataAtualizacao());		
		
		Matricula matriculaAtualizada = matriculaRepository.save(matriculaExistente);
		
		return matriculaMapper.toResponseDTO(matriculaAtualizada);
	}	

	public Matricula buscarMatriculaPorId(Long id) {
		return matriculaRepository.findById(id)
				.orElseThrow(() -> new MatriculaNaoEncontradaException(id));
	}
	
	
}
