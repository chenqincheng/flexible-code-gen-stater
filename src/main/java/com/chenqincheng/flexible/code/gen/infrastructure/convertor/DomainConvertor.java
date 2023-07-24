package com.chenqincheng.flexible.code.gen.infrastructure.convertor;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.DomainDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DomainConvertor {

    DomainConvertor INSTANCE = Mappers.getMapper(DomainConvertor.class);

    @Mappings({})
    DomainDO addCmd2do(DomainAddCmd addCmd);


    @Mappings({})
    DomainDO editCmd2do(DomainEditCmd editCmd);

    @Mappings({})
    Domain do2domain(DomainDO domainDO);
}
