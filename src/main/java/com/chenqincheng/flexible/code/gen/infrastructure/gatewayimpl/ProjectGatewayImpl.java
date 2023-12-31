package com.chenqincheng.flexible.code.gen.infrastructure.gatewayimpl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectDto;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectRequest;
import com.chenqincheng.flexible.code.gen.domain.gateway.ProjectGateway;
import com.chenqincheng.flexible.code.gen.infrastructure.convertor.ProjectConvertor;
import com.chenqincheng.flexible.code.gen.infrastructure.database.ProjectMapper;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.ProjectDO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectGatewayImpl implements ProjectGateway {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public Long add(ProjectAddCmd addCmd) {
        ProjectDO projectDO = ProjectConvertor.INSTANCE.addCmd2do(addCmd);
        projectMapper.insert(projectDO);
        return projectDO.getId();
    }

    @Override
    public ProjectDto get(Long id) {
        ProjectDO projectDO = projectMapper.selectById(id);
        return ProjectConvertor.INSTANCE.do2dto(projectDO);
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
       return projectMapper.dropdown(keyword);
    }

    @Override
    public Boolean delete(Long id) {
        return projectMapper.deleteById(id) > 0;
    }

    @Override
    public PageInfo<ProjectDto> page(ProjectRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ProjectDto> list = projectMapper.page(request);
        return new PageInfo<>(list);
    }
}
