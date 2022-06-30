-- liquibase formatted sql
-- changeset a.koltsov:add_item
CREATE TABLE IF NOT EXISTS item
(
    id         UUID,
    name       VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT item_pk PRIMARY KEY (id),
    CONSTRAINT item_uindex UNIQUE (name)
);
