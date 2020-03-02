package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    void add(User user);
    void delete(long id);
    User getUserById(Long id);
    void update(User user);
    User getUserByLogin(String login);
}
