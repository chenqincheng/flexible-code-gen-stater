package com.chenqincheng.flexible.code.gen.domain.project;

import com.chenqincheng.flexible.code.gen.domain.Entity;
import com.chenqincheng.flexible.code.gen.domain.gateway.ProjectGateway;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Data
@Entity
@Slf4j
@NoArgsConstructor
public class Project {

    private String name;


    private String code;


    @Resource
    private ProjectGateway projectGateway;


}
