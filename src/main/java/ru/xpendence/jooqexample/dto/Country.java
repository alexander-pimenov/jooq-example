package ru.xpendence.jooqexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.xpendence.jooqexample.dto.type.GovernmentForm;

import java.util.List;

/**
 * Описание класса: пару слов что это такое и для чего нужен.
 * Связь один-ко-многим. Country содержит множество связанных City. City содержит countryId.
 * <p>
 * Flyway-миграция описана в resources/db/migration {@link V001.01__create_countries.sql}
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
@AllArgsConstructor
@NoArgsConstructor
public class Country {

    private Long id;
    private String name;
    private GovernmentForm governmentForm;
    private Integer population;

    private List<City> cities;
}
