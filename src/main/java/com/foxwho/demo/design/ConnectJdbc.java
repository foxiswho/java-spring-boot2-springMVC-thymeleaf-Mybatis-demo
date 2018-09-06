package com.foxwho.demo.design;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectJdbc {
    /**
     * 返回表详细数据
     *
     * @return
     */
    public static Map<String, List<Params>> getTableInfo(JdbcEntity jdbcEntity) {
        try {
            //加载驱动类
            Class.forName(jdbcEntity.getDriver());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        //将各种流放入try()中，将由try来执行close()操作
        String sql = "select TABLE_NAME,COLUMN_NAME,COLUMN_COMMENT,COLUMN_TYPE,COLUMN_KEY,COLUMN_DEFAULT from information_schema.COLUMNS where TABLE_SCHEMA='" + jdbcEntity.getDbName() + "'";
        try (Connection con = DriverManager.getConnection(jdbcEntity.getUrl(), jdbcEntity.getUsername(), jdbcEntity.getPassword());
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
        ) {
            //存储
            Map<String, List<Params>> tablesAll = new HashMap<>();
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");
                System.out.println("tableName:" + tableName);
                String className = tableName.replaceAll("m_", "");
                String columnName = rs.getString("COLUMN_NAME");
                String type = rs.getString("COLUMN_TYPE");
                type = cloumnTypeFormat(type);
                // 使首字母大写
                String classNameUpCase = FreemarkUtil.toUpString(className);
                String columnNameUpCase = FreemarkUtil.toUpString(columnName);
                //这里只是使用一个实体类接收ResultSet的结果
                Params params = new Params.Build()
                        .column(columnName)
                        .comment(rs.getString("COLUMN_COMMENT"))
                        .defaultName(rs.getString("COLUMN_DEFAULT"))
                        .type(type)
                        .key(rs.getString("COLUMN_KEY")).tableName(tableName)
                        .className(className).classNameUpCase(classNameUpCase)
                        .columnNameUpCase(columnNameUpCase)
                        .buildParams();
                System.out.println("params:" + params);
                //全部存入
                //查询是否存在该表
                List<Params> list = tablesAll.get(params.getTableName());
                if (list == null) {
                    //key不存在，或者存的值是null
                    //初始化
                    list = new ArrayList();
                    list.add(params);
                    //存储给指定表
                    tablesAll.put(params.getTableName(), list);
                } else {
                    //key存在
                    list.add(params);
                    //存储给指定表
                    tablesAll.put(params.getTableName(), list);
                }
            }
            //全部的MAP
            System.out.println("输出当前库下,所有表结构");
            System.out.println(tablesAll);
            return tablesAll;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * mysql 中类型 对应  java  类型
     * @param type
     * @return
     */
    private static String cloumnTypeFormat(String type) {
        if (type.indexOf("bigint(") >= 0) {
            type = "Integer";
        } else if (type.indexOf("integer(") >= 0) {
            type = "Integer";
        } else if (type.indexOf("mediumint(") >= 0) {
            type = "Integer";
        } else if (type.indexOf("tinyint(") >= 0) {
            type = "Integer";
        } else if (type.indexOf("int(") >= 0) {
            type = "Integer";
        } else if (type.indexOf("text(") >= 0) {
            type = "String";
        } else if (type.indexOf("varchar(") >= 0) {
            type = "String";
        } else if (type.indexOf("datetime") >= 0) {
            type = "Timestamp";
        } else if (type.indexOf("timestamp") >= 0) {
            type = "Timestamp";
        } else if (type.indexOf("time") >= 0) {
            type = "Time";
        } else if (type.indexOf("year") >= 0) {
            type = "Date";
        } else if (type.indexOf("date") >= 0) {
            type = "Date";
        } else if (type.indexOf("decimal") >= 0) {
            type = "BigDecimal";
        } else if (type.indexOf("numeric") >= 0) {
            type = "BigDecimal";
        } else if (type.indexOf("float") >= 0) {
            type = "Float";
        } else if (type.indexOf("double") >= 0) {
            type = "Double";
        } else if (type.indexOf("blog") >= 0) {
            type = "byte[]";
        } else if (type.indexOf("char(") >= 0) {
            type = "String";
        } else {
            type = "String";
        }
        return type;
    }
}
