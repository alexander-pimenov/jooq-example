-- liquibase formatted sql

-- changeset xpendence:001-create-countries
create table if not exists countries
(
    id              bigserial primary key,
    name            varchar(255),
    government_form varchar(255),
    population      int
);
-- rollback drop table countries;