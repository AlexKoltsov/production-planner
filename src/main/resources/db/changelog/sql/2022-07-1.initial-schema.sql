-- liquibase formatted sql
-- changeset a.koltsov:add_example
CREATE SEQUENCE IF NOT EXISTS partner_program_seq START 1 INCREMENT 1;
CREATE TABLE IF NOT EXISTS partner_program
(
    id                        BIGINT,
    name                      VARCHAR,
    slug                      VARCHAR(255),
    registration_postback_url VARCHAR,
    fd_postback_url           VARCHAR,
    profit_postback_url       VARCHAR,
    enabled                   BOOLEAN NOT NULL DEFAULT TRUE,
    deleted                   BOOLEAN NOT NULL DEFAULT FALSE,
    created_at                TIMESTAMP        DEFAULT CURRENT_TIMESTAMP,
    updated_at                TIMESTAMP        DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT partner_program_pk PRIMARY KEY (id),
    CONSTRAINT partner_program_name_uindex UNIQUE (name)
);
