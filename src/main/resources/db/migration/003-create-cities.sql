-- liquibase formatted sql

-- changeset xpendence:003-create-cities
create table if not exists cities
(
    id         bigserial primary key,
    country_id bigint,
    name       varchar(255)
);
-- rollback drop table cities;