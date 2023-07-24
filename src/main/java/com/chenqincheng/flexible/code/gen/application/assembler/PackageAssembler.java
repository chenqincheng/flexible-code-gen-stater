package com.chenqincheng.flexible.code.gen.application.assembler;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PackageAssembler {

    PackageAssembler INSTANCE = Mappers.getMapper(PackageAssembler.class);
}
