package ru.yandex.practicum.filmorate.dao;

import ru.yandex.practicum.filmorate.model.User;

import java.util.List;

public interface UserDbStorage {

    User getUserById(int id);

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(User user);

    void addUserFriend(int userId, int friendId);

    void deleteUserFriend(int userId, int friendId);

    List<User> getUserFriends(int userId);

    List<User> getCommonFriends(int userId, int friendId);
}
