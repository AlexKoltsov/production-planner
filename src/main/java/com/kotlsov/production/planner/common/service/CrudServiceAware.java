package com.kotlsov.production.planner.common.service;

import java.io.Serializable;

public interface CrudServiceAware<ID extends Serializable, T, U> extends ServiceAware<CrudService<ID, T, U>> {
    CrudService<ID, T, U> service();
}
