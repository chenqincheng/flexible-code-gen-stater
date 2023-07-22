package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.application.service.IProjectService;
import com.chenqincheng.flexible.code.gen.domain.gateway.ProjectGateway;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectServiceImpl implements IProjectService {

    @Resource
    private ProjectGateway projectGateway;

    @Override
    public Long add(ProjectAddCmd addCmd) {
        return projectGateway.add(addCmd);
    }

    @Override
    public Long edit(ProjectEditCmd editCmd) {
        return null;
    }

    @Override
    public ProjectDto get(Long id) {
        return projectGateway.get(id);
    }

    @Override
    public Boolean remove(Long id) {
        return null;
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
        return projectGateway.dropdown(keyword);
    }
}
