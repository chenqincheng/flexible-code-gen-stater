package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.github.pagehelper.PageInfo;

public interface IPackageService {
    Long add(PackageAddCmd addCmd);


    boolean edit(PackageEditCmd editCmd);

    boolean delete(Long id);

    DomainDto get(Long id);

    PageInfo<PackageDto> list(PackageRequest request);
}
