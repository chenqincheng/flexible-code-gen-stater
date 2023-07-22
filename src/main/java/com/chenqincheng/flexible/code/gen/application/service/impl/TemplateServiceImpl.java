package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.template.TemplateVO;
import com.chenqincheng.flexible.code.gen.application.service.ITemplateService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TemplateServiceImpl implements ITemplateService {
    @Override
    public Long add(TemplateAddCmd addCommand) {
        return null;
    }

    @Override
    public TemplateVO query(Long id) {
        return null;
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
        return null;
    }

    @Override
    public TemplateVO remove(Long id) {
        return null;
    }

    @Override
    public Long edit(TemplateAddCmd addCommand) {
        return null;
    }
}
