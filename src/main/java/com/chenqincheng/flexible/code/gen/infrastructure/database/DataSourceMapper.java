package com.chenqincheng.flexible.code.gen.infrastructure.database;


import com.chenqincheng.flexible.code.gen.application.dto.ColumnInfoDto;
import com.chenqincheng.flexible.code.gen.application.dto.TableInfoDto;

import java.util.List;

public interface DataSourceMapper {

    List<TableInfoDto> selectDataBaseName();

    List<ColumnInfoDto> selectTableColumn(String tableName);
}
