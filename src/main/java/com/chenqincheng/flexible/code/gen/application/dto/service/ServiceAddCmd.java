package com.chenqincheng.flexible.code.gen.application.dto.service;

import lombok.Data;

@Data
public class ServiceAddCmd {

    /**
     * 项目 id
     */
    private Long projectId;


    /**
     * 域 id
     */
    private Long domainId;


    /**
     * 服务名称
     */
    private String name;

    /**
     * 服务编码
     */
    private String code;


}
