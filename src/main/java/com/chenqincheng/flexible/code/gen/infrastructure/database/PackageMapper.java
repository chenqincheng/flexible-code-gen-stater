package com.chenqincheng.flexible.code.gen.infrastructure.database;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.PackageDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PackageMapper extends BaseMapper<PackageDO> {
    List<LabelValueDto> dropdown(@Param("keyword") String keyword);

    List<PackageDto> page(@Param("request") PackageRequest request);

    DomainDto get(@Param("id") Long id);
}
