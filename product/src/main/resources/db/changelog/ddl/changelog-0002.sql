--liquibase formatted sql

--changeset samhoho:indexing-time
CREATE INDEX idx_product_name_price ON product(name);