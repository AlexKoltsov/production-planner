package com.kotlsov.production.planner.presentation.dto;

import com.kotlsov.production.planner.common.dto.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemDto extends BaseDto<UUID> {
    private String name;
}
