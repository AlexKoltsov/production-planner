package com.kotlsov.production.planner.data.repository;

import com.kotlsov.production.planner.common.repository.BaseJpaRepository;
import com.kotlsov.production.planner.data.entity.ItemEntity;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends BaseJpaRepository<ItemEntity, UUID> {
}
