package src.Seminar.homework_5.notebook;

import src.Seminar.homework_5.notebook.controller.UserController;
import src.Seminar.homework_5.notebook.model.repository.GBRepository;
import src.Seminar.homework_5.notebook.model.repository.impl.UserRepository;
import src.Seminar.homework_5.notebook.view.UserView;

import static src.Seminar.Sem_5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
