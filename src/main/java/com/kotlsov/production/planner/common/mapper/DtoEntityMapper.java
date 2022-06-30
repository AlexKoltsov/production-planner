package com.kotlsov.production.planner.common.mapper;

public interface DtoEntityMapper<DTO, CREATE_DTO, ENTITY> extends Mapper {

    DTO toDto(ENTITY entity);

    ENTITY toEntity(DTO dto);

    ENTITY toNewEntity(CREATE_DTO createDto);
}
