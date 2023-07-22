package com.chenqincheng.flexible.code.gen.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TableInfoDto {

    @Schema(name = "表名")
    private String name;

    @Schema(name = "表描述")
    private String description;
}
