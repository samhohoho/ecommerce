--liquibase formatted sql

--changeset samhoho:1
INSERT INTO product (name, description, short_description, price, brand_id, category_id) VALUES
    ('product1', 'Product description', 'Product short description', 11.11, 1, 1),
    ('product2', 'Product description', 'Product short description', 11.11, 1, 1),
    ('product3', 'Product description', 'Product short description', 11.11, 1, 1),
    ('product4', 'Product description', 'Product short description', 11.11, 1, 1),
    ('product5', 'Product description', 'Product short description', 11.11, 1, 1);

INSERT INTO brand (name) VALUES ('brand name');
INSERT INTO category (name) VALUES ('category name');
