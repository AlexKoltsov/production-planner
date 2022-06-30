package com.kotlsov.production.planner.common.dto;

import com.kotlsov.production.planner.common.IdAble;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDto<ID extends Serializable> implements IdAble<ID> {
    private ID id;
}
