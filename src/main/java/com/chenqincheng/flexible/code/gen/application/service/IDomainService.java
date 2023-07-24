package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainVo;

public interface IDomainService {
    Long add(DomainAddCmd addCmd);

    boolean delete(Long id);

    DomainVo get(Long id);

    boolean edit(DomainEditCmd editCmd);
}
