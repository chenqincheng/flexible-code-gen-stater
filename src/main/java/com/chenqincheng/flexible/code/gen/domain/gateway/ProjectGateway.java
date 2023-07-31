package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectRequest;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ProjectGateway {
    Long add(ProjectAddCmd addCmd);

    ProjectDto get(Long id);

    List<LabelValueDto> dropdown(String keyword);

    Boolean delete(Long id);

    PageInfo<ProjectDto> page(ProjectRequest request);
}
