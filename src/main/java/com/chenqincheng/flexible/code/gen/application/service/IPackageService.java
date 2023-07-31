package com.chenqincheng.flexible.code.gen.application.service;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IPackageService {
    Long add(PackageAddCmd addCmd);


    boolean edit(PackageEditCmd editCmd);

    boolean delete(Long id);

    DomainDto get(Long id);

    PageInfo<PackageDto> page(PackageRequest request);

    List<LabelValueDto> dropdown(String keyword);
}
