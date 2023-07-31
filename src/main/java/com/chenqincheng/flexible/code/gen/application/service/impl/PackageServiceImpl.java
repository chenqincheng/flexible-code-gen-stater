package com.chenqincheng.flexible.code.gen.application.service.impl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageEditCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.application.service.IPackageService;
import com.chenqincheng.flexible.code.gen.domain.DomainFactory;
import com.chenqincheng.flexible.code.gen.domain.gateway.PackageGateway;
import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PackageServiceImpl implements IPackageService {

    @Resource
    private PackageGateway packageGateway;


    @Override
    public Long add(PackageAddCmd addCmd) {
        return packageGateway.add(addCmd);
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
        return packageGateway.get(id);
    }

    @Override
    public PageInfo<PackageDto> page(PackageRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<PackageDto> list = packageGateway.page(request);
        return new PageInfo<>(list);
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
        return packageGateway.dropdown(keyword);
    }
}
