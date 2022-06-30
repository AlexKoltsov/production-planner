package com.kotlsov.production.planner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String entityName, Object id) {
        super("Resource %s with ID %s not found".formatted(entityName, id));
    }
}
