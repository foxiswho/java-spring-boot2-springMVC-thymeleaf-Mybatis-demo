package com.foxwho.demo.mapper;


import java.util.List;


import com.foxwho.demo.entity.UserDomain;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;


public interface UserMapper {
    @InsertProvider(type = UserMapperSqlProvider.class, method = "insert")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(UserDomain record);

    @Insert("INSERT INTO t_user(user_name,password, phone)VALUES(#{userName},#{password},#{phone})")
    @Options(useGeneratedKeys = true, keyProperty = "id") //自动生成主键
    int insert2(UserDomain record);

    List<UserDomain> selectUsers();
}