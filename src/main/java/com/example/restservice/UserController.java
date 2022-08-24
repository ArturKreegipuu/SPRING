package com.example.restservice;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@ToString
public class UserController {

    private final UserService userService;

    @GetMapping("/user")
    public List<User> getUser() {
        return userService.getUser();
    }
    @PostMapping("/addUser")
    public void createUser(@RequestBody User user){
        userService.addUserList(user);
    }

}


