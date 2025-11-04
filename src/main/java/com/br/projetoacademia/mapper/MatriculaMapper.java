package com.br.projetoacademia.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.br.projetoacademia.dto.MatriculaRequestDTO;
import com.br.projetoacademia.dto.MatriculaResponseDTO;
import com.br.projetoacademia.model.Matricula;

@Mapper(componentModel = "spring")
public interface MatriculaMapper {

	MatriculaMapper INSTANCE = Mappers.getMapper(MatriculaMapper.class);

	// DTO -> ENTITY
	@Mapping(target = "id", ignore = true)
	Matricula toEntity(MatriculaRequestDTO dto);

	// ENTITY -> DTO
	MatriculaResponseDTO toResponseDTO(Matricula matricula);
}
