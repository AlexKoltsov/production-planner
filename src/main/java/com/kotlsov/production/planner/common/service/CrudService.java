package com.kotlsov.production.planner.common.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudService<ID extends Serializable, T, U> {

    List<T> getAll();

    Optional<T> getById(ID id);

    T create(U resource);

    T update(T resource);

    boolean deleteById(ID id);
}
