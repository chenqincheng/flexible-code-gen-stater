package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IDomainService {
    Long add(DomainAddCmd addCmd);

    boolean delete(Long id);

    DomainDto get(Long id);

    boolean edit(DomainEditCmd editCmd);

    PageInfo<DomainDto> page(DomainRequest request);

    List<LabelValueDto> dropdown(String keyword);
}
