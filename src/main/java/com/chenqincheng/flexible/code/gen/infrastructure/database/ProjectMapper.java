package com.chenqincheng.flexible.code.gen.infrastructure.database;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.ProjectDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper extends BaseMapper<ProjectDO> {
    List<LabelValueDto> dropdown(@Param("keyword") String keyword);
}
