package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.assembler.DomainAssembler;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainVo;
import com.chenqincheng.flexible.code.gen.application.service.IDomainService;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;
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

    @Override
    public boolean delete(Long id) {
        return domainGateway.delete(id);
    }

    @Override
    public DomainVo get(Long id) {
        Domain domain = domainGateway.get(id);
        return DomainAssembler.INSTANCE.domain2vo(domain);
    }

    @Override
    public boolean edit(DomainEditCmd editCmd) {
        return domainGateway.edit(editCmd);
    }
}
