package com.itheima.controller;

import com.itheima.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class HomeworkController {
    @RequestMapping("/queryUser")
    public String homework01(Integer age, Integer gender, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
        System.out.println(age + gender);
        System.out.println(updateTime);
        return "OK";
    }

    @RequestMapping("queryUser2")
    public String homework02(String id, String name, String phone) {
        System.out.println(id + name + phone);
        return "OK";
    }

    @RequestMapping("queryUser3")
    public String homework03(User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("queryUser41")
    public String homework041(String[] subjects) {
        System.out.println(Arrays.toString(subjects));
        return "OK";
    }

    @RequestMapping("queryUser42")
    public String homework042(@RequestParam List<String> subjects) {
        System.out.println(subjects);
        return "OK";
    }

    @RequestMapping("queryUser5")
    public String homework05(@RequestBody User user) {
        System.out.println(user);
        return "OK";
    }

    @RequestMapping("queryUser6/{id}/{phone}")
    public String homework06(@PathVariable String id, @PathVariable String phone) {
        System.out.println(id + ":" + phone);
        return "OK";
    }
}
