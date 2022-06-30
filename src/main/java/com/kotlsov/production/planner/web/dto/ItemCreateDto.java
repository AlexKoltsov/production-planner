package com.kotlsov.production.planner.web.dto;

import com.kotlsov.production.planner.common.dto.BaseCreateDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ItemCreateDto extends BaseCreateDto {
    private String name;
}
