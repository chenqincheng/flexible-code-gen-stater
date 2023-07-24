package com.chenqincheng.flexible.code.gen.domain.gateway;

import com.chenqincheng.flexible.code.gen.domain.pack.age.Package;

public interface PackageGateway {
    Long add(Package aPackage);

    boolean edit(Package aPackage);

    boolean remove(Package aPackage);
}
