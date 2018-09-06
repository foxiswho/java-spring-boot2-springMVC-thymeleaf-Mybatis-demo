package com.foxwho.demo.design;


public class Params {
    private String tableName;
    private String column;
    private String columnNameUpCase;
    private String comment;
    private String type;
    private String keyName;
    private String defaultName;
    private String className;
    private String classNameUpCase;

    public Params(Build build) {
        this.className = build.className;
        this.classNameUpCase = build.classNameUpCase;
        this.tableName = build.tableName;
        this.column = build.column;
        this.comment = build.comment;
        this.type = build.type;
        this.keyName = build.keyName;
        this.defaultName = build.defaultName;
        this.columnNameUpCase = build.columnNameUpCase;
    }

    public static class Build {
        private String className;
        private String classNameUpCase;
        private String tableName;
        private String column;
        private String columnNameUpCase;
        private String comment;
        private String keyName;
        private String type;
        private String defaultName;

        public Build className(String classN) {
            className = classN;
            return this;
        }

        public Build classNameUpCase(String classNameUpC) {
            classNameUpCase = classNameUpC;
            return this;
        }

        public Build tableName(String tableN) {
            tableName = tableN;
            return this;
        }

        public Build columnNameUpCase(String columnNameUpCaseN) {
            columnNameUpCase = columnNameUpCaseN;
            return this;
        }
        public Build column(String columnN) {
            column = columnN;
            return this;
        }
        public Build key(String keyN) {
            keyName = keyN;
            return this;
        }
        public Build comment(String commentN) {
            comment = commentN;
            return this;
        }
        public Build type(String typeN) {
            type = typeN;
            return this;
        }
        public Build defaultName(String defaultN) {
            defaultName = defaultN;
            return this;
        }
        public Params buildParams() {
            return new Params(this);
        }
    }
    public String getTableName() {
        return tableName;
    }
    public String getColumn() {
        return column;
    }
    public String getColumnNameUpCase() {
        return columnNameUpCase;
    }
    public String getComment() {
        return comment;
    }
    public String getType() {
        return type;
    }
    public String getKeyName() {
        return keyName;
    }
    public String getDefaultName() {
        return defaultName;
    }
    public String getClassName() {
        return className;
    }
    public String getClassNameUpCase() {
        return classNameUpCase;
    }
}