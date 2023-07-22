package com.chenqincheng.flexible.code.gen.infrastructure.convertor;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.DomainDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DomainConvertor {

    DomainConvertor INSTANCE = Mappers.getMapper(DomainConvertor.class);

    @Mappings({})
    DomainDO addCmd2do(DomainAddCmd addCmd);
}
