package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueVO;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectVO;

import java.util.List;

public interface ProjectGateway {
    Long add(ProjectAddCmd addCmd);

    ProjectVO get(Long id);

    List<LabelValueVO> dropdown(String keyword);
}
