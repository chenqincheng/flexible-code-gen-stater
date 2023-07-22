package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainAddCmd;

public interface DomainGateway {
    Long add(DomainAddCmd addCmd);
}
