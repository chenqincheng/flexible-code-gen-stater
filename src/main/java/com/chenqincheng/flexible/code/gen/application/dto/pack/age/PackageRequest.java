package com.chenqincheng.flexible.code.gen.application.dto.pack.age;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PackageRequest {

    @Schema(description = "别名")
    private String alias;

    @Schema(description = "路径")
    private String path;

    @Schema(description = "页码")
    private Integer pageNum = 1;

    @Schema(description = "每页数量")
    private Integer pageSize = 10;

}
