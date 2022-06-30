package com.kotlsov.production.planner.common.repository;

public interface RepositoryAware<T> {
    T repository();
}
