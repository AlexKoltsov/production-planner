package com.kotlsov.production.planner.common.api;

import com.kotlsov.production.planner.common.dto.BaseCreateDto;
import com.kotlsov.production.planner.common.dto.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface CrudApi<ID extends Serializable, T extends BaseDto<ID>, U extends BaseCreateDto> {
    List<T> getAll();

    List<T> getById(ID id);

    T create(U resource);

    T update(T resource);

    boolean deleteById(ID id);
}
