package ru.yandex.practicum.filmorate.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.LinkedHashSet;

@Data
@Builder
public class Film {

    private int id;
    @NotBlank(message = "Имя не может быть пустым")
    private String name;
    @Size(max = 200, message = "Описание превышает 200 символов")
    private String description;
    private LocalDate releaseDate;
    @Positive(message = "Значение не должно быть отрицательным")
    private int duration;
    private MPA mpa;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private LinkedHashSet<Genre> genres;

}