package com.example.springsecruity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/student")
    public String getFoo() {
        return "Student";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/visitor")
    public String visitor() {
        return "visitor";
    }

}
