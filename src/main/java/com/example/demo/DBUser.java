package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;

public class DBUser {

    private List<User> userTable = new ArrayList<User>();

    public DBUser() {
        userTable.add(new User(1, "Person 1", 10));
        userTable.add(new User(2, "Person 2", 20));
    }

    public List<User> getAllUsers() {
        return userTable;
    }

    public User getAUser(int id) {
        for(User user: userTable) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for(User user:userTable) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User createUser(User user) {
        userTable.add(user);
        return user;
    }

    public User deleteUser(int id) {
        for (User user: userTable) {
            if (user.getId() == id) {
                User tmp = user;
                userTable.remove(user);
                System.out.println(tmp);
                return tmp;
            }
        }
        return null;
    }

}
