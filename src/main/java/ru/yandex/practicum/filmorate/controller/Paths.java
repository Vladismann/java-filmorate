package ru.yandex.practicum.filmorate.controller;

public final class Paths {
    public static final String FILMS_PATH = "/films";
    public static final String USERS_PATH = "/users";
    public static final String GET_BY_ID_PATH = "/{id}";
    public static final String UPDATE_FRIEND_PATH = "/{id}/friends/{friendId}";
    public static final String GET_USER_FRIENDS_PATH = "{id}/friends";
    public static final String GET_COMMON_FRIENDS_PATH = "{id}/friends/common/{otherId}";
    public static final String UPDATE_LIKE_PATH = "/{id}/like/{userId}";
    public static final String GET_POPULAR_FILMS_PATH = "/popular";
    public static final String MPA_PATH = "/mpa";
    public static final String GENRES_PATH = "/genres";

}
