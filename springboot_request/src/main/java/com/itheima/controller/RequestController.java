package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RequestController {

    @RequestMapping("/simpleParam")
    public String simpleParam(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        // 类型转换
        int ageInt = Integer.parseInt(age);
        System.out.println(name + " : " + ageInt);
        return "OK";
    }

    @RequestMapping("simpleParam2")
    public String simpleParam2(String name, Integer age) {
        System.out.println(name + " : " + age);
        return "OK";
    }

    @RequestMapping("simpleParam3")
    public String simpleParam3(@RequestParam("name") String username, Integer age) {
        System.out.println(username + " : " + age);
        return "OK";
    }
}
