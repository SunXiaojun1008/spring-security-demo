package com.spring.security.web.controller;


import com.spring.security.dto.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "用户查询服务")
    @GetMapping
    public List<User> query() {
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;

    }

    @GetMapping("/{id:\\d+}")
    public User getInfo(@ApiParam(value = "用户ID") @PathVariable String id){
        User user = new User();
        user.setUsername("Tom");
        return user;
    }

    @PostMapping
    public User create(@PathVariable User user){
        user.setId("1");
        return user;
    }

}
