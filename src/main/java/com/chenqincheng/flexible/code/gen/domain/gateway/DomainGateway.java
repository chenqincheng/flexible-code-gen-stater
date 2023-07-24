package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainEditCmd;
import com.chenqincheng.flexible.code.gen.domain.domain.Domain;

public interface DomainGateway {
    Long add(DomainAddCmd addCmd);

    boolean delete(Long id);

    boolean edit(DomainEditCmd editCmd);

    Domain get(Long id);
}
