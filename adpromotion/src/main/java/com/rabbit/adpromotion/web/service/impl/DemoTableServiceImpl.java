package com.rabbit.adpromotion.web.service.impl;

import com.rabbit.adpromotion.utils.R;
import com.rabbit.adpromotion.web.dao.DemoTableMapper;
import com.rabbit.adpromotion.web.dao.model.DemoTable;
import com.rabbit.adpromotion.web.service.DemoTableService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("DemoTableService")
public class DemoTableServiceImpl implements DemoTableService {

    private Logger logger = LogManager.getLogger(DemoTableServiceImpl.class);

    @Autowired
    DemoTableMapper demoTableMapper;


    @Override
    public List<DemoTable> getDemoTableList() {
        return demoTableMapper.queryDemoTable();
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public R save(DemoTable demoTable) {
        Integer id = demoTable.getId();
        String operateType = id == null?"【插入一条记录】":"【更新一条记录】";
        try{
            if (id == null){
                int effectedNum = demoTableMapper.insertDemoTable(demoTable);
                if (effectedNum>0){
                    return R.ok();
                }else {
                    logger.error("插入数据失败!");
                    return R.error();
                }
            }else {
                int effectedNum = demoTableMapper.updateDemoTable(demoTable);
                if (effectedNum>0){
                    return R.ok();
                }else {
                    logger.error("更新数据失败!");
                    return R.error();
                }
            }
        }catch (Exception e){
            logger.error("异常!",operateType,e);
            return R.error();
        }
    }
}
