package com.rabbit.adpromotion.web.controller;

import com.rabbit.adpromotion.utils.R;
import com.rabbit.adpromotion.web.dao.model.DemoTable;
import com.rabbit.adpromotion.web.service.DemoTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demoTable")
public class DemoTableController {

    @Autowired
    private DemoTableService demoTableService;

    @RequestMapping("/listDemoTable")
    public R listDemoTable(){
        List<DemoTable> demoTableList = demoTableService.getDemoTableList();
        return R.ok().put("data",demoTableList);
    }
}
