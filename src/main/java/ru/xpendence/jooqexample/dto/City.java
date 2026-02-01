package ru.xpendence.jooqexample.dto;

import lombok.Data;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 * Связь ManyToOne. City содержит countryId. Country содержит множество связанных City.
 * <p>
 * Flyway-миграция описана в resources/db/migration {@link V002.01__create_cities.sql}
 * <p>
 * Сущности генерируются отдельно. Есть два способа это сделать.
 * - Посредством плагина Maven.
 * - В Java-коде.
 * <p>
 *
 * @author Вячеслав Чернышов
 * @since 15.02.2020
 */
@Data
public class City {

    private Long id;
    private Long countryId;
    private String name;
}
