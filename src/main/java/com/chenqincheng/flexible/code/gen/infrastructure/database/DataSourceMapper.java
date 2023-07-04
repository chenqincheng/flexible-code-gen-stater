package com.chenqincheng.flexible.code.gen.infrastructure.database;


import com.chenqincheng.flexible.code.gen.application.dto.ColumnInfoVO;
import com.chenqincheng.flexible.code.gen.application.dto.TableInfoVO;

import java.util.List;

public interface DataSourceMapper {

    List<TableInfoVO> selectDataBaseName();

    List<ColumnInfoVO> selectTableColumn(String tableName);
}
