package com.foxwho.demo.design;

public class DesignType {
    //类型
    public static final String DAO = "dao";
    public static final String ENTITY = "entity";
    public static final String SERVICE = "service";
    public static final String SERVICEIMPL = "serviceImpl";

    /**
     * 你模板放置的路径
     */
    private static String basePath = "src/main/resources/design/";
    /**
     * 生成文件保存路径
     */
    private static String savePath = "src/main/java/com/foxwho/demo";
    //各种路径
    private static String entityPath = "";
    private static String daoPath = "";
    private static String servicePath = "";
    private static String serviceImplPath = "";
    private static String user_path;
    private static String makeClassSuffix = ".java";

    public static String getSavePath() {
        return savePath;
    }

    public static String getBasePath() {
        return basePath;
    }

    /**
     *
     */
    public static void init() {
        if (user_path == null) {
            user_path = System.getProperty("user.dir") + "/";
            basePath = user_path + basePath;
        }
        //
        // 存入，作为参数给页面 className：作为引用名 ClassName：作为类名
        entityPath = savePath + "/entity/";
        daoPath = savePath + "/dao/";
        servicePath = savePath + "/service/";
        serviceImplPath = savePath + "/service/impl/";
    }

    /**
     * 获取生成路径
     *
     * @param type
     * @return
     */
    public static String getMakePath(String type) {
        String str = "";
        switch (type) {
            case DAO:
                str = daoPath;
                break;
            case ENTITY:
                str = entityPath;
                break;

            case SERVICE:
                str = servicePath;
                break;

            case SERVICEIMPL:
                str = serviceImplPath;
                break;
        }
        return str;
    }

    /**
     * 获取生成路径
     *
     * @param type
     * @return
     */
    public static String getMakeFile(String type, String className) {
        String str = "";
        switch (type) {
            case DAO:
                str = daoPath + className + "Dao" + makeClassSuffix;
                break;
            case ENTITY:
                str = entityPath + className + makeClassSuffix;
                break;

            case SERVICE:
                str = servicePath + className + "Service" + makeClassSuffix;
                break;

            case SERVICEIMPL:
                str = serviceImplPath + className + "ServiceImpl" + makeClassSuffix;
                break;
        }
        return str;
    }

    private static String templateSuffix = ".ftl";

    /**
     * 模板名称
     *
     * @param type
     * @return
     */
    public static String getTemplateName(String type) {
        return type + templateSuffix;
    }
}
