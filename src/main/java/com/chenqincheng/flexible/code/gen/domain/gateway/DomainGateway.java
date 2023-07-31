package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;

import java.util.List;

public interface DomainGateway {
    Long add(DomainAddCmd addCmd);

    boolean delete(Long id);

    boolean edit(DomainEditCmd editCmd);

    Domain get(Long id);

    List<DomainDto> list(DomainRequest request);

    List<LabelValueDto> dropdown(String keyword);
}
