package com.kotlsov.production.planner.common.api;

import com.kotlsov.production.planner.common.dto.BaseCreateDto;
import com.kotlsov.production.planner.common.dto.BaseDto;
import com.kotlsov.production.planner.common.service.CrudServiceAware;

import java.io.Serializable;
import java.util.List;

public abstract class BaseCrudApi<ID extends Serializable, T extends BaseDto<ID>, U extends BaseCreateDto>
    implements CrudApi<ID, T, U>, CrudServiceAware<ID, T, U> {

    @Override
    public List<T> getAll() {
        return service().getAll();
    }

    @Override
    public T getById(ID id) {
        return service().getById(id)
            .orElseThrow(() -> entityNotFoundException(id));
    }

    @Override
    public T create(U resource) {
        return service().create(resource);
    }

    @Override
    public T update(T resource) {
        return service().update(resource);
    }

    @Override
    public boolean deleteById(ID id) {
        return service().deleteById(id);
    }

    protected abstract RuntimeException entityNotFoundException(ID id);
}
