-- liquibase formatted sql

-- changeset xpendence:002-insert-countries
insert into countries(name, government_form, population)
values ('Russia', 'FEDERATE', 146745098),
       ('China', 'UNITARY', 1404328611),
       ('Switzerland', 'CONFEDERATE', 8558758);
-- rollback delete from countries where name in ('Russia', 'China', 'Switzerland');