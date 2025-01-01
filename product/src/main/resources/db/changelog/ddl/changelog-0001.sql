--liquibase formatted sql

--changeset samhoho:1
CREATE TABLE product (
    id BIGSERIAL NOT NULL,
    name VARCHAR(255),
    description VARCHAR(255),
    short_description VARCHAR(255),
    PRIMARY KEY (id)
);
