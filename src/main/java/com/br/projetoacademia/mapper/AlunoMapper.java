package com.br.projetoacademia.mapper;

import org.springframework.stereotype.Component;

import com.br.projetoacademia.dto.AlunoRequestDTO;
import com.br.projetoacademia.dto.AlunoResponseDTO;
import com.br.projetoacademia.model.Aluno;

@Component	
public class AlunoMapper {

    public Aluno toEntity(AlunoRequestDTO dto) {
        if (dto == null) return null;
        return Aluno.builder()
                .nome(dto.getNome())
                .email(dto.getEmail())
                .senha(dto.getSenha())
                .cpf(dto.getCpf())
                .dataNascimento(dto.getDataNascimento())
                .telefone(dto.getTelefone())
                .ativo(dto.getAtivo())
                .genero(dto.getGenero())
                .build();
    }

    public AlunoResponseDTO toResponseDTO(Aluno aluno) {
        if (aluno == null) return null;
        return  AlunoResponseDTO.builder()
                .id(aluno.getId())
                .nome(aluno.getNome())
                .email(aluno.getEmail())
                .cpf(aluno.getCpf())
                .dataNascimento(aluno.getDataNascimento())
                .telefone(aluno.getTelefone())
                .ativo(aluno.getAtivo())
                .genero(aluno.getGenero())
                .build();
    }

    public void atualizarAluno(Aluno aluno, AlunoRequestDTO dto) {
        aluno.setNome(dto.getNome());
        aluno.setEmail(dto.getEmail());
        aluno.setSenha(dto.getSenha());
        aluno.setCpf(dto.getCpf());
        aluno.setDataNascimento(dto.getDataNascimento());
        aluno.setTelefone(dto.getTelefone());
        aluno.setAtivo(dto.getAtivo());
        aluno.setGenero(dto.getGenero());
    }
}
