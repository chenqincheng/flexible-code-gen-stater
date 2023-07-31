package com.chenqincheng.flexible.code.gen.infrastructure.gatewayimpl;

import com.chenqincheng.flexible.code.gen.application.dto.LabelValueDto;
import com.chenqincheng.flexible.code.gen.application.dto.domain.DomainDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageAddCmd;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageDto;
import com.chenqincheng.flexible.code.gen.application.dto.pack.age.PackageRequest;
import com.chenqincheng.flexible.code.gen.domain.gateway.PackageGateway;
import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;
import com.chenqincheng.flexible.code.gen.infrastructure.convertor.PackageConvertor;
import com.chenqincheng.flexible.code.gen.infrastructure.database.PackageMapper;
import com.chenqincheng.flexible.code.gen.infrastructure.database.dataobject.PackageDO;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PackageGatewayImpl implements PackageGateway {

    @Resource
    private PackageMapper packageMapper;

    @Override
    public Long add(PackageAddCmd addCmd) {
        PackageDO packageDO = PackageConvertor.INSTANCE.addCmd2PackageDO(addCmd);
        packageMapper.insert(packageDO);
        return packageDO.getId();
    }

    @Override
    public boolean edit(Package aPackage) {
        return false;
    }

    @Override
    public boolean remove(Package aPackage) {
        return false;
    }

    @Override
    public List<LabelValueDto> dropdown(String keyword) {
        return packageMapper.dropdown(keyword);
    }

    @Override
    public List<PackageDto> page(PackageRequest request) {
        return packageMapper.page(request);
    }

    @Override
    public DomainDto get(Long id) {
        return packageMapper.get(id);
    }
}
