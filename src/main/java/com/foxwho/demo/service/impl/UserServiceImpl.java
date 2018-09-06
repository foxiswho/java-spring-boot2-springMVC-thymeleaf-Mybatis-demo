package com.foxwho.demo.service.impl;

import java.util.List;

import com.foxwho.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foxwho.demo.entity.UserDomain;
import com.foxwho.demo.service.UserService;
import com.github.pagehelper.PageHelper;


@Service(value = "UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;//这里会报错，但是并不会影响

    @Override
    public int addUser(UserDomain user) {

        return userMapper.insert(user);
    }

    /**
     *
     * @param page 页码
     * @param pageSize 每页数量
     * @return
     */
    @Override
    public List<UserDomain> findAllUser(int page, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(page, pageSize);
        return userMapper.selectUsers();
    }
}
