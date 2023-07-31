package com.chenqincheng.flexible.code.gen.infrastructure.database;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.DomainDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DomainMapper extends BaseMapper<DomainDO> {
    List<DomainDto> page(@Param("request") DomainRequest request);

    List<LabelValueDto> dropdown(@Param("keyword") String keyword);
}
