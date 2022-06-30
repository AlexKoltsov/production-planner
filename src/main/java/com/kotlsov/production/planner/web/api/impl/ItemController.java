package com.kotlsov.production.planner.web.api.impl;

import com.kotlsov.production.planner.common.api.BaseCrudApi;
import com.kotlsov.production.planner.common.service.CrudService;
import com.kotlsov.production.planner.exception.ResourceNotFoundException;
import com.kotlsov.production.planner.service.ItemService;
import com.kotlsov.production.planner.web.api.ItemApi;
import com.kotlsov.production.planner.web.dto.ItemCreateDto;
import com.kotlsov.production.planner.web.dto.ItemDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class ItemController extends BaseCrudApi<UUID, ItemDto, ItemCreateDto> implements ItemApi {

    private final ItemService itemService;

    @Override
    public CrudService<UUID, ItemDto, ItemCreateDto> service() {
        return itemService;
    }

    @Override
    protected RuntimeException entityNotFoundException(UUID uuid) {
        return new ResourceNotFoundException("Item", uuid);
    }
}
