package com.chenqincheng.flexible.code.gen.infrastructure.gatewayimpl;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;
import com.chenqincheng.flexible.code.gen.domain.gateway.DomainGateway;
import com.chenqincheng.flexible.code.gen.infrastructure.convertor.DomainConvertor;
import com.chenqincheng.flexible.code.gen.infrastructure.database.DomainMapper;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.DomainDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;

@Component
public class DomainGatewayImpl implements DomainGateway {

    @Resource
    private DomainMapper domainMapper;


    @Override
    public Long add(DomainAddCmd addCmd) {
        DomainDO domainDO = DomainConvertor.INSTANCE.addCmd2do(addCmd);
        domainDO.setCreatedAt(new Date());
        domainDO.setUpdatedAt(new Date());
        domainDO.setIsDeleted(0);
        domainMapper.insert(domainDO);
        return domainDO.getId();
    }

    @Override
    public boolean delete(Long id) {
        int rows = domainMapper.deleteById(id);
        return rows > 0;
    }

    @Override
    public boolean edit(DomainEditCmd editCmd) {
        DomainDO domainDO = DomainConvertor.INSTANCE.editCmd2do(editCmd);
        domainDO.setUpdatedAt(new Date());
        int rows = domainMapper.updateById(domainDO);
        return rows > 0;
    }

    @Override
    public Domain get(Long id) {
        DomainDO domainDO = domainMapper.selectById(id);
        if (domainDO == null) {
            throw new RuntimeException("domain not found");
        }
        return DomainConvertor.INSTANCE.do2domain(domainDO);
    }
}
