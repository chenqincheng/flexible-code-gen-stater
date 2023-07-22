package com.chenqincheng.flexible.code.gen.application.dto.project;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ProjectAddCmd {

    /**
     * 名称
     */
    @Schema(name = "名称")
    private String name;

    /**
     * 服务编码
     */
    @Schema(name = "编码")
    private String code;



    @Schema(name = "描述")
    private String description;


}
