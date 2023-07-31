package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectRequest;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IProjectService {
    Long add(ProjectAddCmd addCmd);

    Long edit(ProjectEditCmd editCmd);

    ProjectDto get(Long id);

    Boolean remove(Long id);

    List<LabelValueDto> dropdown(String keyword);

    PageInfo<ProjectDto> page(ProjectRequest request);
}
