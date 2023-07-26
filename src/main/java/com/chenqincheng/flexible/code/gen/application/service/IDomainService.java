package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainRequest;
import com.github.pagehelper.PageInfo;

public interface IDomainService {
    Long add(DomainAddCmd addCmd);

    boolean delete(Long id);

    DomainDto get(Long id);

    boolean edit(DomainEditCmd editCmd);

    PageInfo<DomainDto> list(DomainRequest request);
}
