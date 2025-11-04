package com.br.projetoacademia.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.br.projetoacademia.model.Aluno;
import com.br.projetoacademia.dto.AlunoRequestDTO;
import com.br.projetoacademia.dto.AlunoResponseDTO;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

	AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);
	
	//DTO -> ENTITY
	@Mapping(target = "id", ignore = true)
	Aluno toEntity(AlunoRequestDTO dto);
	
	//ENTITY -> DTO
	AlunoResponseDTO toResponseDTO(Aluno aluno);
}
