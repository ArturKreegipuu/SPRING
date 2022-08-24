package com.example.restservice;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {
    private  final AtomicLong counter = new AtomicLong();
    private List<User> userList = loadUsersFromIMdb();

    private List<User> loadUsersFromIMdb(){
        List<User> users = new ArrayList<User>();
        users.add(new User(counter.incrementAndGet(), "Artur", LocalDate.of(2001, Month.APRIL, 20), "artur@kreegipuu.net"));
        users.add(new User(counter.incrementAndGet(), "Arthur", LocalDate.of(2002, Month.APRIL, 20), "arthur@kreegipuu.net"));
        return users;
    }

    public List<User> getUser() {
        return userList;
    }
    public void addUserList(User user){
        if (user.getId() == null) {
            user.setId(userList.get(userList.size() - 1).getId() + 1);
        }
        userList.add(user);
    }

}
