package com.kotlsov.production.planner.mapper;

import com.kotlsov.production.planner.common.mapper.DtoEntityMapper;
import com.kotlsov.production.planner.data.entity.ItemEntity;
import com.kotlsov.production.planner.web.dto.ItemCreateDto;
import com.kotlsov.production.planner.web.dto.ItemDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ItemMapper extends DtoEntityMapper<ItemDto, ItemCreateDto, ItemEntity> {

    @Override
    ItemDto toDto(ItemEntity itemEntity);

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Override
    ItemEntity toEntity(ItemDto itemDto);

    @Mapping(target = "id", expression = "java(java.util.UUID.randomUUID())")
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Override
    ItemEntity toNewEntity(ItemCreateDto itemCreateDto);
}
