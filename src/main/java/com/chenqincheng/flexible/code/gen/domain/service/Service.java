package com.chenqincheng.flexible.code.gen.domain.service;

import com.chenqincheng.flexible.code.gen.domain.Entity;
import com.chenqincheng.flexible.code.gen.domain.gateway.ProjectGateway;
import com.chenqincheng.flexible.code.gen.domain.gateway.ServiceGateway;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Data
@Entity
@Slf4j
@NoArgsConstructor
public class Service {

    private String name;


    private String code;


    private String description;


    @Resource
    private ServiceGateway serviceGateway;


    /**
     * 服务关联项目
     * @param projectId 项目
     * @return 关联结果
     */
    public Boolean link(Long projectId){
        return null;
    }


}
