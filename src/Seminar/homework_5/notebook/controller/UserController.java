package src.Seminar.homework_5.notebook.controller;

import src.Seminar.homework_5.notebook.model.User;
import src.Seminar.homework_5.notebook.model.repository.GBRepository;

import java.util.List;

public class UserController implements Controller {
    private final GBRepository repository;

    public UserController(GBRepository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.create(user);
    }


    public void updateUser(String userId, User update) {
        update.setId(Long.parseLong(userId));
        repository.update(Long.parseLong(userId), update);
    }

    public List<User> readAll() {
        return repository.findAll();
    }


    public boolean deleteUser(String id) {
        return repository.delete(Long.parseLong(id));
    }

    public User readUser(long l) {
        return repository.readUser(l);
    }
}
