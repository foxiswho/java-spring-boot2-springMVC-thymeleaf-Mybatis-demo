package com.foxwho.demo.design;

import java.util.List;

public class ParamsTable {
    public Params table;
    public List<Params> lists;

    public Params getTable() {
        return table;
    }

    public void setTable(Params table) {
        this.table = table;
    }

    public List<Params> getLists() {
        return lists;
    }

    public void setLists(List<Params> lists) {
        this.lists = lists;
        //赋值给表名称
        this.table = lists.get(0);
    }
}
