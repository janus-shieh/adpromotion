package com.rabbit.adpromotion.web.dao;

import com.rabbit.adpromotion.web.dao.model.DemoTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoTableMapperTest {
    @Autowired
    private DemoTableMapper demoTableMapper;

    @Test
    public void queryDemoTable() {
        List<DemoTable> demoTables = demoTableMapper.queryDemoTable();

    }

    @Test
    public void queryDemoTableById() {
        DemoTable demoTable = demoTableMapper.queryDemoTableById(1);
        System.out.println(demoTable.getDemoName());
    }

    @Test
    public void insertDemoTable() {
        DemoTable demoTable = new DemoTable();
        demoTable.setDemoName("alibaba");
        demoTable.setDemoAge(2);
        demoTable.setDemoTime(new Date());
        int a = demoTableMapper.insertDemoTable(demoTable);
    }

    @Test
    public void updateDemoTable() {
    }

    @Test
    public void deleteDemoTable() {
    }
}