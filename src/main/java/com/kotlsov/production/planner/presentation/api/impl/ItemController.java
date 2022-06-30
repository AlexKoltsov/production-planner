package com.kotlsov.production.planner.presentation.api.impl;

import com.kotlsov.production.planner.presentation.api.ItemApi;
import com.kotlsov.production.planner.presentation.dto.ItemCreateDto;
import com.kotlsov.production.planner.presentation.dto.ItemDto;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class ItemController implements ItemApi {

    @Override
    public List<ItemDto> getAll() {
        return null;
    }

    @Override
    public List<ItemDto> getById(UUID uuid) {
        return null;
    }

    @Override
    public ItemDto create(ItemCreateDto resource) {
        return null;
    }

    @Override
    public ItemDto update(ItemDto resource) {
        return null;
    }

    @Override
    public boolean deleteById(UUID uuid) {
        return false;
    }
}
