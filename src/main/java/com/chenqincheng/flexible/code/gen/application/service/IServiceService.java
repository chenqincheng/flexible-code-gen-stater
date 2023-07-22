package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.service.ServiceVO;

import java.util.List;

public interface IServiceService {
    Long add(ServiceAddCmd addCmd);

    Long edit(ServiceEditCmd editCmd);

    ServiceVO get(Long id);

    Boolean remove(Long id);

    List<LabelValueDto> dropdown(String keyword);
}
