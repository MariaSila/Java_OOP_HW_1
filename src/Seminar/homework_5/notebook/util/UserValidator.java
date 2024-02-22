package src.Seminar.homework_5.notebook.util;

import src.Seminar.homework_5.notebook.model.User;

public class UserValidator {
    public User validate(User user) {
        String name = user.getFirstName().replaceAll(" ", "").trim();
        String lName = user.getLastName().replaceAll(" ", "").trim();
        user.setFirstName(name);
        user.setLastName(lName);
        return user;

    }
}
