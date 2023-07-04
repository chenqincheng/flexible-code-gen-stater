package com.chenqincheng.flexible.code.gen.adapter;

import com.chenqincheng.flexible.code.gen.application.dto.ColumnInfoVO;
import com.chenqincheng.flexible.code.gen.application.dto.TableInfoVO;
import com.chenqincheng.flexible.code.gen.application.service.DataSourceService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DataSourceController {

    @Resource
    private DataSourceService dataSourceService;

    @GetMapping("/table")
    @Operation(summary = "查询表")
    public List<TableInfoVO> queryTable() {
        return dataSourceService.queryTable();
    }


    @GetMapping("/column")
    @Operation(summary = "查询表字段")
    public List<ColumnInfoVO> queryTableColumn(@RequestParam(value = "tableName", required = true) String tableName) {
        return dataSourceService.queryTableColumn(tableName);
    }

}
