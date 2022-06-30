package com.kotlsov.production.planner.service;

import com.kotlsov.production.planner.common.mapper.DtoEntityMapper;
import com.kotlsov.production.planner.common.repository.BaseJpaRepository;
import com.kotlsov.production.planner.common.service.BaseCrudService;
import com.kotlsov.production.planner.data.entity.ItemEntity;
import com.kotlsov.production.planner.data.repository.ItemRepository;
import com.kotlsov.production.planner.mapper.ItemMapper;
import com.kotlsov.production.planner.web.dto.ItemCreateDto;
import com.kotlsov.production.planner.web.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ItemService extends BaseCrudService<UUID, ItemDto, ItemCreateDto, ItemEntity> {

    private final ItemMapper itemMapper;
    private final ItemRepository itemRepository;

    @Override
    public DtoEntityMapper<ItemDto, ItemCreateDto, ItemEntity> mapper() {
        return itemMapper;
    }

    @Override
    public BaseJpaRepository<ItemEntity, UUID> repository() {
        return itemRepository;
    }
}
