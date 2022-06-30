package com.kotlsov.production.planner.common.service;

import com.kotlsov.production.planner.common.mapper.DtoEntityMapperAware;
import com.kotlsov.production.planner.common.repository.BaseJpaRepositoryAware;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class BaseCrudService<ID extends Serializable, DTO, CREATE_DTO, ENTITY> implements
    CrudService<ID, DTO, CREATE_DTO>,
    BaseJpaRepositoryAware<ENTITY, ID>,
    DtoEntityMapperAware<DTO, CREATE_DTO, ENTITY> {

    @Override
    public List<DTO> getAll() {
        return repository().findAll().stream()
            .map(resource -> mapper().toDto(resource))
            .collect(Collectors.toList());
    }

    @Override
    public Optional<DTO> getById(ID id) {
        return repository().findById(id)
            .map(resource -> mapper().toDto(resource));
    }

    @Override
    public DTO create(CREATE_DTO resource) {
        ENTITY entity = mapper().toNewEntity(resource);
        ENTITY saved = repository().save(entity);
        return mapper().toDto(saved);
    }

    @Override
    public DTO update(DTO resource) {
        ENTITY entity = mapper().toEntity(resource);
        ENTITY saved = repository().save(entity);
        return mapper().toDto(saved);
    }

    @Override
    public boolean deleteById(ID id) {
        repository().deleteById(id);
        return true;
    }
}
