package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {

    DBUser dbUser = new DBUser();

    @GetMapping("/hi")
    public String sayHi() {
        return "Hello from Server";
    }

    @GetMapping("/search")
    public String SearchAWord(@RequestParam String s) {
        return s;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return dbUser.getAllUsers();
    }
    
//    @GetMapping("/users/{id}")
//    public ResponseEntity<User> getSingleUser(@PathVariable int id) {
//        ResponseEntity<User> responseEntity = new ResponseEntity<User>();
//        User user = dbUser.getAUser(id);
//
//    }

    @GetMapping("/user")
    public User getSingleUserByName(@RequestParam String name) {
        return dbUser.getUserByName(name);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user ) {
        return dbUser.createUser(user);
    }

}
