package com.chenqincheng.flexible.code.gen.infrastructure.convertor;

import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.PackageDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PackageConvertor {

    PackageConvertor INSTANCE = Mappers.getMapper(PackageConvertor.class);

    @Mappings({})
    PackageDO addCmd2PackageDO(PackageAddCmd addCmd);
}
