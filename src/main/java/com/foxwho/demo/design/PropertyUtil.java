package com.foxwho.demo.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

/**
 * 读取配置文件获取数据库存相关信息
 */
public class PropertyUtil {
    private static final Logger logger = LoggerFactory.getLogger(PropertyUtil.class);
    private static Properties props;
    private static JdbcEntity jdbc = new JdbcEntity();

    static {
        loadProps();
        loadInit();
    }

    synchronized static private void loadProps() {
        logger.info("开始加载properties文件内容.......");
        props = new Properties();
        InputStream in = null;
        try {
            //第一种，通过类加载器进行获取properties文件流
            in = PropertyUtil.class.getClassLoader().getResourceAsStream("schemeone/properties/mysql.properties");
            //第二种，通过类进行获取properties文件流
            //in = PropertyUtil.class.getResourceAsStream("/jdbc.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            logger.error("jdbc.properties文件未找到");
        } catch (IOException e) {
            logger.error("出现IOException");
        } finally {
            try {
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                logger.error("jdbc.properties文件流关闭出现异常");
            }
        }
        logger.info("加载properties文件内容完成...........");
        logger.info("properties文件内容：" + props);
    }

    public static String getProperty(String key) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        if (null == props) {
            loadProps();
        }
        return props.getProperty(key, defaultValue);
    }

    synchronized static private void loadInit() {
        init();
        logger.info("填充 jdbc 数据完成...........");
    }

    public static JdbcEntity init() {
        jdbc.setDriver(getProperty("jdbc.driverClass"));
        jdbc.setUrl(getProperty("jdbc.url"));
        jdbc.setUsername(getProperty("jdbc.userId"));
        jdbc.setPassword(getProperty("jdbc.password"));
        jdbc.setPrefix(getProperty("jdbc.dbPrefix"));
        jdbc.setDbName(getProperty("jdbc.dbName"));
        return jdbc;
    }

    public static JdbcEntity getJdbcEntity() {
        if (jdbc.getClass() == null) {
            init();
        }
        return jdbc;
    }
}