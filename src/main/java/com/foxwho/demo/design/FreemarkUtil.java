package com.foxwho.demo.design;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.net.URL;

public class FreemarkUtil {
    // 创建Configuration实例
    private static Configuration cfg = new Configuration();
    private static Template temp = null;

    /**
     *
     */
    public static void init() {
        DesignType.init();
    }

    public static void genateCode() {
        init();
        File loadTemplateFile = new File(DesignType.getBasePath());
        try {
            cfg.setDirectoryForTemplateLoading(loadTemplateFile);
            //
            Map<String, List<Params>> tablesInfo = ConnectJdbc.getTableInfo(PropertyUtil.getJdbcEntity());
            SetJavaCode(tablesInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 首字母大写
     *
     * @param className
     * @return
     */
    public static String toUpString(String className) {
        char[] cs = className.toCharArray();
        cs[0] -= 32;
        String ClassName = String.valueOf(cs);
        return ClassName;
    }

    /**
     * 处理表
     *
     * @param tableName
     * @param tableInfo
     */
    public static void processTable(String tableName, List<Params> tableInfo) {

        //表明,指定类名
        String className = tableName;
        JdbcEntity jdbc = PropertyUtil.getJdbcEntity();
        //表前缀是否存在,如果存在,则替换
        if (!jdbc.getPrefix().isEmpty()) {
            className = tableName.replaceAll(jdbc.getPrefix(), "");
        }
        // 使首字母大写
        String ClassName = toUpString(className);
        System.out.println("------------ 表 " + DesignType.DAO + "-------------");
        System.out.println("------------ 类名称 " + ClassName + "-------------");

        System.out.println("------------ 开始生成 " + DesignType.DAO + "-------------");
        makeTemplate(ClassName, tableInfo, DesignType.DAO);
        System.out.println("------------ 生成完毕 -------------");


        System.out.println("------------ 开始生成 " + DesignType.ENTITY + "-------------");
        makeTemplate(ClassName, tableInfo, DesignType.ENTITY);
        System.out.println("------------ 生成完毕 -------------");

        System.out.println("------------ 开始生成 " + DesignType.SERVICE + "-------------");
        makeTemplate(ClassName, tableInfo, DesignType.SERVICE);
        System.out.println("------------ 生成完毕 -------------");

        System.out.println("------------ 开始生成 " + DesignType.SERVICEIMPL + "-------------");
        makeTemplate(ClassName, tableInfo, DesignType.SERVICEIMPL);
        System.out.println("------------ 生成完毕 -------------");
    }

    /**
     * 生成文件
     *
     * @param className
     * @param tableInfo
     * @param type
     */
    public static void makeTemplate(String className, List<Params> tableInfo, String type) {
        File newsDir = new File(DesignType.getSavePath());
        //目录不存在则创建该目录
        if (newsDir.exists() == false) {
            newsDir.mkdirs();
        }
        File newsDir2 = new File(DesignType.getMakePath(type));
        //目录不存在则创建该目录
        if (newsDir2.exists() == false) {
            newsDir2.mkdirs();
        }
        String file = DesignType.getMakeFile(type, className);
        System.out.println("文件路径:" + file);
        //写入保存文件
        try (Writer out = new OutputStreamWriter(new FileOutputStream(file), "utf-8");) {
            temp = cfg.getTemplate(DesignType.getTemplateName(type));
            //整合数据
            ParamsTable pt = new ParamsTable();
            pt.setLists(tableInfo);
            temp.process(pt, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void SetJavaCode(Map<String, List<Params>> tablesInfo) {
        //遍历
        for (Map.Entry<String, List<Params>> entry : tablesInfo.entrySet()) {
            System.out.println("------------处理表 " + entry.getKey() + " -------------");
            processTable(entry.getKey(), entry.getValue());
            System.out.println("------------处理表 " + entry.getKey() + " 完成-------------");
        }

    }

    public static void main(String[] args) {
        System.out.println("========getProjectPath:" + System.getProperty("user.dir"));
        genateCode();

        System.out.println("------------SUCCESS-------------");
        System.out.println("------------SUCCESS-------------");
        System.out.println("------------SUCCESS-------------");
        System.out.println("------------SUCCESS-------------");
        System.out.println("------------SUCCESS-------------");
    }
}