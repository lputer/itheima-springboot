package com.itheima.controller;

import com.itheima.Pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

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

    // @RequestParam: 参数名和形参名不一致的时候使用该注解做关系映射, 该注解一旦使用就必须要传递参数, 如果不想传递可以设置required
    @RequestMapping("simpleParam4")
    public String simpleParam4(@RequestParam(value = "name", required = false) String username, Integer age) {
        System.out.println(username + " : " + age);
        return "OK";
    }

    // 简单pojo
    @RequestMapping("/simplePojo")
    public String simplePojo(User user) {
        System.out.println(user);
        return "OK";
    }

    // 复杂pojo
    @RequestMapping("/complexPojo")
    public String complexPojo(User user) {
        System.out.println(user);
        return "OK";
    }

    // 数组参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby) {
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    // 集合参数
    @RequestMapping("/listParam")
    public String listParam(@RequestParam List hobby) {
        System.out.println(hobby);
        return "OK";
    }
}
