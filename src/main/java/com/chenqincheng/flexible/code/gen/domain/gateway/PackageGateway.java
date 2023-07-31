package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;

import java.util.List;

public interface PackageGateway {
    Long add(PackageAddCmd addCmd);

    boolean edit(Package packageDomain);

    boolean remove(Package packageDomain);

    List<LabelValueDto> dropdown(String keyword);

    List<PackageDto> page(PackageRequest request);

    DomainDto get(Long id);
}
