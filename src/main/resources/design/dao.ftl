package com.foxwho.demo.mapper;

import com.foxwho.demo.entity.${table.classNameUpCase};

public interface ${table.classNameUpCase}Mapper {
    int delete(Integer id);

    int insert(${table.classNameUpCase} record);

    int update(${table.classNameUpCase} record);

    ${table.classNameUpCase} find(Integer id);

    List<${table.classNameUpCase}> findAll(int page, int pageSize);
}