package com.foxwho.demo.service;

import java.util.List;

import com.foxwho.demo.entity.UserDomain;

/**
 *
 */
public interface UserService {

    int addUser(UserDomain user);

    List<UserDomain> findAllUser(int pageNum, int pageSize);
}
