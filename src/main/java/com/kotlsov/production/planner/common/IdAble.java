package com.kotlsov.production.planner.common;

import java.io.Serializable;

public interface IdAble<ID extends Serializable> {
    ID getId();
}
