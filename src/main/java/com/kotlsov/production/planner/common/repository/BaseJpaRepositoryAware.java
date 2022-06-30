package com.kotlsov.production.planner.common.repository;

public interface BaseJpaRepositoryAware<T, ID> extends RepositoryAware<BaseJpaRepository<T, ID>> {
    BaseJpaRepository<T, ID> repository();
}
