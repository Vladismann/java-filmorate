package ru.yandex.practicum.filmorate.query;

public class FilmQuery {

    public static final String CREATE_FILM = "INSERT INTO films " +
            "(name, description, release_date, duration, rating_id) " +
            "VALUES (?, ?, ?, ?, ?)";

    public static final String ADD_FILM_GENRES = "INSERT INTO film_genres " +
            "(film_id, genre_id) " +
            "VALUES (?, ?)";

    public static final String GET_FILM_BY_NAME = "SELECT * FROM films WHERE name = ?"
}
