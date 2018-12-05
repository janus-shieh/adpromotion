package com.rabbit.adpromotion.web.dao;

import com.rabbit.adpromotion.web.dao.model.DemoTable;

import java.util.List;

public interface DemoTableMapper {
    /**
    /查出所有
     */
    List<DemoTable> queryDemoTable();
    /**
     /查出一条记录
     */
    DemoTable queryDemoTableById(Integer id);
    /**
     /插入一条记录
     */
    int insertDemoTable(DemoTable demoTable);
    /**
     /更新一条记录
     */
    int updateDemoTable(DemoTable demoTable);
    /**
     /删除一条记录
     */
    int deleteDemoTable(Integer id);
}
