package com.chenqincheng.flexible.code.gen.infrastructure.convertor;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PackageConvertor {

    PackageConvertor INSTANCE = Mappers.getMapper(PackageConvertor.class);
}
