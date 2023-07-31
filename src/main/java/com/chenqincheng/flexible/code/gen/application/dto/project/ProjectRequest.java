package com.chenqincheng.flexible.code.gen.application.dto.project;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Data
public class ProjectRequest {

    @Schema(name = "名称")
    private String name;

    @Schema(name = "编码")
    private String code;

    @Schema(name = "页码")
    private Integer pageNum = 1;

    @Schema(name = "每页数量")
    private Integer pageSize = 10;
}
