package com.chenqincheng.flexible.code.gen.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SingleFile {

    @Schema(name = "文件名称")
    private String fileName;

    @Schema(name = "服务编码")
    private String serviceCode;

    @Schema(name = "包路径")
    private String packagePath;

    @Schema(name = "前缀")
    private String prefix;

    @Schema(name = "后缀")
    private String suffix;

    @Schema(name = "生成字段集合")
    private List<ColumnInfoDto> columns;
}
