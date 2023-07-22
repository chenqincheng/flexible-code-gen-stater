package com.chenqincheng.flexible.code.gen.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class SingleFileGenCmd {
    @Schema(name = "表名")
    private Long tableName;

    @Schema(name = "模板id")
    private Long templateId;

    @Schema(name = "服务id")
    private Long serviceId;

    @Schema(name = "服务编码")
    private String serviceCode;

    @Schema(name = "包名id")
    private Long packageId;

    @Schema(name = "生成id集合")
    private List<ColumnInfoDto> columns;

    @Schema(name = "前缀")
    private String prefix;

    @Schema(name = "后缀")
    private String suffix;

}
