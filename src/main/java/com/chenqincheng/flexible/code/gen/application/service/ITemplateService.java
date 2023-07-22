package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateVO;

import java.util.List;

public interface ITemplateService {
    Long add(TemplateAddCmd addCommand);

    TemplateVO query(Long id);

    List<LabelValueDto> dropdown(String keyword);

    TemplateVO remove(Long id);

    Long edit(TemplateAddCmd addCommand);
}
