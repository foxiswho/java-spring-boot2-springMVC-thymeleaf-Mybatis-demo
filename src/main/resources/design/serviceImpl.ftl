package com.foxwho.demo.service.impl;

import java.util.List;

import com.foxwho.demo.mapper.${table.classNameUpCase}Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foxwho.demo.entity.${table.classNameUpCase};
import com.foxwho.demo.service.${table.classNameUpCase}Service;
import com.github.pagehelper.PageHelper;


@Service(value = "${table.classNameUpCase}Service")
public class ${table.classNameUpCase}ServiceImpl implements ${table.classNameUpCase}Service {

    @Autowired
    private ${table.classNameUpCase}Mapper ${table.className}Mapper;//这里会报错，但是并不会影响

    @Override
    public int delete(Integer id) {

        return ${table.className}Mapper.delete(id);
    }

    @Override
    public int insert(${table.classNameUpCase} ${table.className}) {

        return ${table.className}Mapper.insert(${table.className});
    }

    @Override
    public int update(${table.classNameUpCase} ${table.className}) {

        return ${table.className}Mapper.update(${table.className});
    }

    /**
     *
     * @param page 页码
     * @param pageSize 每页数量
     * @return
     */
    @Override
    public List<${table.classNameUpCase}> findAll(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return ${table.className}Mapper.findAll(page,pageSize);
    }
}
