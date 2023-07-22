package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.service.IDomainService;
import com.chenqincheng.flexible.code.gen.domain.gateway.DomainGateway;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DomainServiceImpl implements IDomainService {


    @Resource
    private DomainGateway domainGateway;


    @Override
    public Long add(DomainAddCmd addCmd) {
        return domainGateway.add(addCmd);
    }
}
