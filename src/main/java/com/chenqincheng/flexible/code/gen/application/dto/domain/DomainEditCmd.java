package com.chenqincheng.flexible.code.gen.application.dto.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DomainEditCmd {

    @Schema(name = "id")
    private Long id;

    /**
     * 名称
     */
    @Schema(name = "名称")
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * 服务编码
     */
    @Schema(name = "编码")
    @NotBlank(message = "编码不能为空")
    private String code;


    @Schema(name = "描述")
    @NotBlank(message = "描述不能为空")
    private String description;

}
