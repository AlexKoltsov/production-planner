package com.kotlsov.production.planner.presentation.api;

import com.kotlsov.production.planner.ApiUrl;
import com.kotlsov.production.planner.common.api.CrudApi;
import com.kotlsov.production.planner.presentation.dto.ItemCreateDto;
import com.kotlsov.production.planner.presentation.dto.ItemDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping(ApiUrl.Item.BASE)
public interface ItemApi extends CrudApi<UUID, ItemDto, ItemCreateDto> {

    @GetMapping
    @Override
    List<ItemDto> getAll();

    @GetMapping("{uuid}")
    @Override
    List<ItemDto> getById(@PathVariable UUID uuid);

    @PostMapping
    @Override
    ItemDto create(@Valid @RequestBody ItemCreateDto resource);

    @PutMapping
    @Override
    ItemDto update(@Valid @RequestBody ItemDto resource);

    @DeleteMapping("{uuid}")
    @Override
    boolean deleteById(@PathVariable UUID uuid);
}
