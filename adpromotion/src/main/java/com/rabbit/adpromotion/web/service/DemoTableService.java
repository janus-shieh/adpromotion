package com.rabbit.adpromotion.web.service;

import com.rabbit.adpromotion.utils.R;
import com.rabbit.adpromotion.web.dao.model.DemoTable;

import java.util.List;

public interface DemoTableService {

    /**
     * 查询
     * @return
     */
    List<DemoTable> getDemoTableList();

    /**
     * 增加
     * @param demoTable
     * @return
     */
    R save(DemoTable demoTable);
}
