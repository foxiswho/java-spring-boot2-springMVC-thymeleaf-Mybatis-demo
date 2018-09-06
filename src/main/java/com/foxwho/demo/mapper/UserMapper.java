package com.foxwho.demo.mapper;


import java.util.List;


import com.foxwho.demo.entity.UserDomain;


public interface UserMapper {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();
}