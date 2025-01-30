--liquibase formatted sql

--changeset samhoho:1
CREATE TABLE product (
    id SERIAL NOT NULL,
    name VARCHAR(255) UNIQUE,
    description VARCHAR(255),
    short_description VARCHAR(255),
    price FLOAT(53),
    brand_id SERIAL,
    category_id SERIAL,
    PRIMARY KEY (id)
);

CREATE TABLE brand (
    id SERIAL NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE category (
    id SERIAL NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);
