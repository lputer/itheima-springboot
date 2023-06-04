package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("我是瓜瓜,是兄弟就来砍我~");
        return "我是瓜瓜,是兄弟就来砍我~";
    }

    @RequestMapping("/simpleParam")
    public String simpleParam(String name, Integer age){
        System.out.println(name+" : "+age);
        return "OK";
    }

    @RequestMapping("/simplePojo")
    public String simplePojo(User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }

    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("/listUser")
    public List<User> listUser(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Tom",20));
        userList.add(new User("Lisa",21));
        return userList;
    }
}
