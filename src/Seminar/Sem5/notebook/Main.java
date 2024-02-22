package src.Seminar.Sem5.notebook;

import src.Seminar.Sem5.notebook.controller.UserController;
import src.Seminar.Sem5.notebook.model.dao.impl.FileOperation;
import src.Seminar.Sem5.notebook.model.dao.impl.UserRepository;
import src.Seminar.Sem5.notebook.model.repository.GBRepository;
import src.Seminar.Sem5.notebook.view.UserView;

import static src.Seminar.Sem5.notebook.util.DBConnector.DB_PATH;
import static src.Seminar.Sem5.notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}
