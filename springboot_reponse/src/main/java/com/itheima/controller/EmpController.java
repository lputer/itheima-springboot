package com.itheima.controller;

import com.itheima.common.Result;
import com.itheima.pojo.Emp;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired // 运行时,IOC容器会提供该类型的bean对象,并赋值给该变量 - 依赖注入
    private EmpService empService;

    @RequestMapping("/listEmp")
    public Result list() {
        List<Emp> empList = empService.listEmp();
        // 1. 加载并解析emp.xml文件 dao层
        // 2. 对数据进行转换处理 service层
        // 3. 响应数据 controller层
        return Result.success(empList);
    }
}
