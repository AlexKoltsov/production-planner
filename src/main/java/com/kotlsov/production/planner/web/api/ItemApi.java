package com.kotlsov.production.planner.web.api;

import com.kotlsov.production.planner.common.api.CrudApi;
import com.kotlsov.production.planner.web.dto.ItemCreateDto;
import com.kotlsov.production.planner.web.dto.ItemDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping(ApiUrls.Item.BASE)
public interface ItemApi extends CrudApi<UUID, ItemDto, ItemCreateDto> {

    @GetMapping
    @Override
    List<ItemDto> getAll();

    @GetMapping("{id}")
    @Override
    ItemDto getById(@PathVariable UUID id);

    @PostMapping
    @Override
    ItemDto create(@Valid @RequestBody ItemCreateDto resource);

    @PutMapping
    @Override
    ItemDto update(@Valid @RequestBody ItemDto resource);

    @DeleteMapping("{id}")
    @Override
    boolean deleteById(@PathVariable UUID id);
}
