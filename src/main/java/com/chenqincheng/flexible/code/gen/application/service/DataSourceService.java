package com.chenqincheng.flexible.code.gen.application.service;


import com.chenqincheng.flexible.code.gen.infrastructure.database.DataSourceMapper;
import com.chenqincheng.flexible.code.gen.application.dto.ColumnInfoVO;
import com.chenqincheng.flexible.code.gen.application.dto.TableInfoVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DataSourceService {

    @Resource
    private DataSourceMapper dataSourceMapper;

    public List<TableInfoVO> queryTable() {
        return dataSourceMapper.selectDataBaseName();
    }

    public List<ColumnInfoVO> queryTableColumn(String tableName) {
        return dataSourceMapper.selectTableColumn(tableName);
    }
}
