package com.chenqincheng.flexible.code.gen.domain;

public class DomainFactory {

    public static <T> T get(Class<T> entityClz){
        return ApplicationContextHelper.getBean(entityClz);
    }

}