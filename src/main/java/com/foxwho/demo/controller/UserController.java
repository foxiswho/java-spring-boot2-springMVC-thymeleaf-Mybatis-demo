package com.foxwho.demo.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.foxwho.demo.entity.UserDomain;
import com.foxwho.demo.service.UserService;
import com.github.pagehelper.PageHelper;

import java.util.List;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(int page, int pageSize) {
        List<UserDomain> list =userService.findAllUser(page,pageSize);
        PageInfo pageInfo =new PageInfo(list);
        return pageInfo;
    }
}
