package com.itheima.controller;

import com.itheima.common.Result;
import com.itheima.pojo.Address;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
// @ResponseBody 将return返回的数据响应给浏览器, 如果返回的是对象或者集合, 会把对象或者集合转成json格式, 响应给浏览器
public class ResponseController {
    //响应字符串
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello World ~");
        return Result.success("Hello World ~");
    }

    //响应实体对象
    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();//创建实体类对象
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }

    //响应集合数据
    @RequestMapping("/listAddr")
    public Result listAddr() {
        List<Address> list = new ArrayList<>();//集合对象

        Address addr = new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("陕西");
        addr2.setCity("西安");

        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
