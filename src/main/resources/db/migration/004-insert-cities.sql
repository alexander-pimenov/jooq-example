-- liquibase formatted sql

-- changeset xpendence:004-insert-cities
insert into cities(country_id, name)
values (1, 'Moscow'),
       (1, 'Saint-Petersburg'),
       (1, 'Sevastopol'),
       (2, 'Beijing'),
       (2, 'Shanghai'),
       (2, 'Hong Kong'),
       (3, 'Zurich'),
       (3, 'Geneva'),
       (3, 'Bern');
-- rollback delete from cities;