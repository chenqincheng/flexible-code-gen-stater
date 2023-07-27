package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;

public interface PackageGateway {
    Long add(Package packageDomain);

    boolean edit(Package packageDomain);

    boolean remove(Package packageDomain);
}
