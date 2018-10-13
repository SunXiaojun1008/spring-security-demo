package com.spring.security.web.controller;


import com.spring.security.dto.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.ServletWebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ProviderSignInUtils providerSignInUtils;

    @PostMapping("/regist")
    public void regist(User user, HttpServletRequest request) {

        //不管是注册用户还是绑定用户，都会拿到一个用户唯一标识。
        String userId = user.getUsername();
        providerSignInUtils.doPostSignUp(userId, new ServletWebRequest(request));
    }


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
