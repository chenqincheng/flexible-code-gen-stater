package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueVO;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.project.ProjectVO;

import java.util.List;

public interface IProjectService {
    Long add(ProjectAddCmd addCmd);

    Long edit(ProjectEditCmd editCmd);

    ProjectVO get(Long id);

    Boolean remove(Long id);

    List<LabelValueVO> dropdown(String keyword);
}
