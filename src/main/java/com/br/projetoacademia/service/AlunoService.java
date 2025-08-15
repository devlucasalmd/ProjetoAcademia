package com.br.projetoacademia.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.br.projetoacademia.dto.AlunoDTO;
import com.br.projetoacademia.exception.AlunoJaInativoException;
import com.br.projetoacademia.exception.AlunoNaoEncontradoException;
import com.br.projetoacademia.model.Aluno;
import com.br.projetoacademia.repository.AlunoRepository;

@Service
public class AlunoService {

	private final AlunoRepository alunoRepository;

	public AlunoService(AlunoRepository alunoRepository) {		
		this.alunoRepository = alunoRepository;
	}
	
	public AlunoDTO criarAluno(Aluno aluno) {
		aluno.setAtivo(true);
		return toDTO(alunoRepository.save(aluno));
	}
	
	public List<AlunoDTO> listarAlunos() { 
		return alunoRepository.findAll()
				.stream()
				.map(this::toDTO)
				.collect(Collectors.toList()); 
	}
	
	public AlunoDTO buscarPorId(Long id) { 
		Aluno aluno =  alunoRepository.findById(id)
				.orElseThrow(() -> new AlunoNaoEncontradoException(id));
		
		return toDTO(aluno); 					
	}	
	
	public AlunoDTO atualizarAluno(Long id, Aluno novoAluno){
		Aluno aluno = alunoRepository.findById(id)
				.orElseThrow(() -> new AlunoNaoEncontradoException(id));
		
			aluno.setNome(novoAluno.getNome());
			aluno.setEmail(novoAluno.getEmail());
			aluno.setPassword(novoAluno.getPassword());
			aluno.setCpf(novoAluno.getCpf());
			aluno.setDataNasc(novoAluno.getDataNasc());
			aluno.setTelefone(novoAluno.getTelefone());
			aluno.setAtivo(novoAluno.getAtivo());
			
			return toDTO(alunoRepository.save(aluno));			
	}
	
	public void desativarAluno(Long id) {
		Aluno aluno = alunoRepository.findById(id)
				.orElseThrow(() -> new AlunoNaoEncontradoException(id));
		if(!aluno.getAtivo()) {
			throw new AlunoJaInativoException(id);
		}
		
		aluno.setAtivo(false);
		alunoRepository.save(aluno);		
	}
	
	private AlunoDTO toDTO(Aluno aluno) {
        return new AlunoDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail(),
                aluno.getCpf(),
                aluno.getDataNasc(),
                aluno.getTelefone(),
                aluno.getAtivo()
        );
    }
}
