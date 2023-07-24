package com.chenqincheng.flexible.code.gen.application.assembler;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainVo;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DomainAssembler {

    DomainAssembler INSTANCE = Mappers.getMapper(DomainAssembler.class);

    @Mappings({})
    DomainVo domain2vo(Domain domain);
}
