package src.Seminar.homework_5.notebook.util.mapper;

import src.Seminar.homework_5.notebook.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
