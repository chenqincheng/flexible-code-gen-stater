package com.chenqincheng.flexible.code.gen.infrastructure.gatewayimpl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueVO;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectVO;
import com.chenqincheng.flexible.code.gen.domain.gateway.ProjectGateway;
import com.chenqincheng.flexible.code.gen.infrastructure.database.ProjectMapper;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.ProjectDO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectGatewayImpl implements ProjectGateway {

    @Resource
    private ProjectMapper projectMapper;

    @Override
    public Long add(ProjectAddCmd addCmd) {
        ProjectDO projectDO = new ProjectDO();
        projectDO.setName(addCmd.getName());
        projectDO.setCode(addCmd.getCode());
        projectMapper.insert(projectDO);
        return projectDO.getId();
    }

    @Override
    public ProjectVO get(Long id) {
        ProjectDO projectDO = projectMapper.selectById(id);
        ProjectVO projectVO = new ProjectVO();
        BeanUtils.copyProperties(projectDO, projectVO);
        return projectVO;
    }

    @Override
    public List<LabelValueVO> dropdown(String keyword) {

       return projectMapper.dropdown(keyword);
    }
}
