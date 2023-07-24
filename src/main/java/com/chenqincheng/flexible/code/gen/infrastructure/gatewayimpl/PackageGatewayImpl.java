package com.chenqincheng.flexible.code.gen.infrastructure.gatewayimpl;

import com.chenqincheng.flexible.code.gen.domain.gateway.PackageGateway;
import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;
import org.springframework.stereotype.Component;

@Component
public class PackageGatewayImpl implements PackageGateway {
    @Override
    public Long add(Package aPackage) {
        return null;
    }

    @Override
    public boolean edit(Package aPackage) {
        return false;
    }

    @Override
    public boolean remove(Package aPackage) {
        return false;
    }
}
