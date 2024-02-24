package src.Seminar.homework_5.notebook.util.mapper.impl;

import src.Seminar.homework_5.notebook.model.User;
import src.Seminar.homework_5.notebook.util.mapper.Mapper;

public class UserMapper implements Mapper {
    @Override
    public String toInput(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    @Override
    public User toOutput(String s) {
        String[] lines = s.split(",");
        long id;
        if (isDigit(lines[0])) {
            id = Long.parseLong(lines[0]);
            return new User(id, lines[1], lines[2], lines[3]);
        }
        throw new NumberFormatException("Id must be a large number");
    }

    private boolean isDigit(String s) throws NumberFormatException {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
