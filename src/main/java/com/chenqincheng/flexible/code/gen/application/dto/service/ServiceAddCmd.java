package com.chenqincheng.flexible.code.gen.application.dto.service;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ServiceAddCmd {

    /**
     * 项目 id
     */
    @NotNull(message = "项目 id 不能为空")
    private Long projectId;


    /**
     * 域 id
     */
    @NotNull(message = "域 id 不能为空")
    private Long domainId;


    /**
     * 服务名称
     */
    @NotBlank(message = "服务名称不能为空")
    private String name;

    /**
     * 服务编码
     */
    @NotBlank(message = "服务编码不能为空")
    private String code;


}
