package src.Seminar.homework_5.notebook.model.repository.impl;

import src.Seminar.homework_5.notebook.model.User;

import src.Seminar.homework_5.notebook.model.repository.GBRepository;
import src.Seminar.homework_5.notebook.util.DBConnector;
import src.Seminar.homework_5.notebook.util.UserValidator;
import src.Seminar.homework_5.notebook.util.mapper.impl.UserMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserRepository implements GBRepository {
    private final UserMapper mapper;

    public UserRepository() {
        this.mapper = new UserMapper();

    }

    @Override
    public List<User> findAll() {
        List<String> lines = readAll();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.toOutput(line));
        }
        return users;
    }

    public User readUser(Long userId) {
        List<User> users = findAll();
        User user = findById(users, userId);
        return user;
    }

    @Override
    public List<String> readAll() {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(DBConnector.DB_PATH);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void saveAll(List<String> data) {
        try (FileWriter writer = new FileWriter(DBConnector.DB_PATH, false)) {
            for (String line : data) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User create(User user) {
        UserValidator uv = new UserValidator();
        user = uv.validate(user);
        List<User> users = findAll();
        long max = 0L;
        for (User u : users) {
            long id = u.getId();
            if (max < id){
                max = id;
            }
        }
        long next = max + 1;
        user.setId(next);
        users.add(user);
        write(users);
        return user;
    }

    @Override
    public User findById(List<User> users, Long id) {
        for (User user : users) {
            if (Objects.equals(user.getId(), id)) {
                return user;
            }
        }
        throw new RuntimeException("User not found");
    }


    @Override
    public Optional<User> update(Long userId, User update) {
        List<User> users = findAll();
        User editUser = findById(users, userId);
/*        List<User> users = findAll();
        User editUser = users.stream()
                .filter(u -> u.getId()
                        .equals(userId))
                .findFirst().orElseThrow(() -> new RuntimeException("User not found"));*/
/*        User editUser = null;
        for (User user : users) {
            if (Objects.equals(user.getId(), userId)) {
                editUser = user;
            }
        }*/
        if(update.getFirstName().isEmpty()){
            editUser.setFirstName(editUser.getFirstName());
        } else editUser.setFirstName(update.getFirstName());
        if(update.getLastName().isEmpty()){
            editUser.setLastName(editUser.getLastName());
        } else editUser.setLastName(update.getLastName());
        if(update.getPhone().isEmpty()){
            editUser.setPhone(editUser.getPhone());
        } else editUser.setPhone(update.getPhone());
        write(users);
        return Optional.of(update);
    }

    @Override
    public boolean delete(Long id) {
        boolean deleteUser = false;
        List<User> users = findAll();
        User deletUser = findById(users, id);
        users.remove(deletUser);
        deleteUser = true;
        long idNew = 1L;
        for (User u : users) {
            u.setId(idNew);
            idNew++;
        }
        write(users);
        return deleteUser;
    }

    private void write(List<User> users) {
        List<String> lines = new ArrayList<>();
        for (User u: users) {
            lines.add(mapper.toInput(u));
        }
        saveAll(lines);
    }

}
