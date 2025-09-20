package com.br.projetoacademia.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.br.projetoacademia.dto.AlunoRequestDTO;
import com.br.projetoacademia.dto.AlunoResponseDTO;
import com.br.projetoacademia.exception.AlunoJaInativoException;
import com.br.projetoacademia.exception.AlunoNaoEncontradoException;
import com.br.projetoacademia.mapper.AlunoMapper;
import com.br.projetoacademia.model.Aluno;
import com.br.projetoacademia.repository.AlunoRepository;

@Service
public class AlunoService {

	private final AlunoRepository alunoRepository;
	private final AlunoMapper alunoMapper;

	public AlunoService(AlunoRepository alunoRepository, AlunoMapper alunoMapper) {		
		this.alunoRepository = alunoRepository;
		this.alunoMapper = alunoMapper ;
	}
	
	public AlunoResponseDTO criarAluno(AlunoRequestDTO dto) {
		Aluno aluno = alunoMapper.toEntity(dto);
		aluno.setAtivo(true);
		return alunoMapper.toResponseDTO(alunoRepository.save(aluno));
	}
	
	public List<AlunoResponseDTO> listarAlunos() { 
		return alunoRepository.findAll()
				.stream()
				.map(alunoMapper::toResponseDTO)
				.collect(Collectors.toList()); 
	}
	
	public AlunoResponseDTO buscarPorId(Long id) { 
		Aluno aluno =  buscarAlunoPorId(id);	
		return alunoMapper.toResponseDTO(aluno); 					
	}	
	
	public AlunoResponseDTO atualizarAluno(Long id, AlunoRequestDTO novoAluno){
		Aluno aluno = buscarAlunoPorId(id);		
		alunoMapper.atualizarAluno(aluno, novoAluno);
		return alunoMapper.toResponseDTO(alunoRepository.save(aluno));
	}
	
	public void desativarAluno(Long id) {
		Aluno aluno = buscarAlunoPorId(id);
				
		if(!aluno.getAtivo()) {
			throw new AlunoJaInativoException(id);
		}
		
		aluno.setAtivo(false);
		alunoRepository.save(aluno);		
	}
	
	 private Aluno buscarAlunoPorId(Long id) {
	        return alunoRepository.findById(id)
	                .orElseThrow(() -> new AlunoNaoEncontradoException(id));
	    }
}
