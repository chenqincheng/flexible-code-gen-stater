package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.application.service.IPackageService;
import com.chenqincheng.flexible.code.gen.domain.DomainFactory;
import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public class PackageServiceImpl implements IPackageService {


    @Override
    public Long add(PackageAddCmd addCmd) {
        Package packageDomain = DomainFactory.get(Package.class);
        return packageDomain.add();
    }

    @Override
    public boolean edit(PackageEditCmd editCmd) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public DomainDto get(Long id) {
        return null;
    }

    @Override
    public PageInfo<PackageDto> list(PackageRequest request) {
        return null;
    }
}
