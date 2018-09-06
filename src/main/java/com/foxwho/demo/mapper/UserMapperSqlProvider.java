package com.foxwho.demo.mapper;

import java.util.Map;

import com.foxwho.demo.entity.UserDomain;
import org.apache.ibatis.jdbc.SQL;

public class UserMapperSqlProvider {
    public String selectWhitParamSql(Map<String, Object> param) {
        return new SQL() {
            {
                SELECT("*");
                FROM("tb_employee");
                if (param.get("id") != null) {
                    WHERE("id=#{id}");
                }
                if (param.get("loginname") != null) {
                    WHERE("loginname=#{loginname}");
                }
                if (param.get("password") != null) {
                    WHERE("password=#{password}");
                }
                if (param.get("name") != null) {
                    WHERE("name=#{name}");
                }
                if (param.get("sex") != null) {
                    WHERE("sex=#{sex}");
                }
                if (param.get("age") != null) {
                    WHERE("age=#{age}");
                }
                if (param.get("phone") != null) {
                    WHERE("phone=#{phone}");
                }
                if (param.get("sal") != null) {
                    WHERE("sal=#{sal}");
                }
                if (param.get("state") != null) {
                    WHERE("state=#{state}");
                }
            }

        }.toString();
    }

    public String insert(UserDomain record) {
        return new SQL() {
            {
                INSERT_INTO("t_user");
                if (record.getUserName() != null) {
                    VALUES("user_name", "#{userName}");
                }
                if (record.getPassword() != null) {
                    VALUES("password", "#{password}");
                }
                if (record.getPhone() != null) {
                    VALUES("phone", "#{phone}");
                }
            }
        }.toString();
    }
}
