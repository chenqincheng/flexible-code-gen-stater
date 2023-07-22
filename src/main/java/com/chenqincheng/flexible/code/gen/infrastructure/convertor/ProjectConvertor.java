package com.chenqincheng.flexible.code.gen.infrastructure.convertor;

import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.ProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProjectConvertor {

    ProjectConvertor INSTANCE = Mappers.getMapper(ProjectConvertor.class);

    @Mappings({})
    ProjectDO addCmd2do(ProjectAddCmd addCmd);

    @Mappings({})
    ProjectDto do2dto(ProjectDO projectDo);
}
