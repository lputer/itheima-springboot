package com.example.springboot_homework_day04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public String test(){
        return "Hello User";
    }
}
