package com.chenqincheng.flexible.code.gen.application.dto.pack.age;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PackageAddCmd {

    @Schema(name = "父id")
    private Long parentId;

    @Schema(name = "别名")
    private String alias;

    @Schema(name = "路径")
    private String path;

    @Schema(name = "描述")
    private String description;
}
