package com.chenqincheng.flexible.code.gen.application.constant;

/**
 * 后缀 Suffix
 * 前缀 prefix
 */
public enum SuffixEnum {

    VO("view object", "VO", "视图对象")

    ;

    SuffixEnum(String name, String code, String desc) {
        this.name = name;
        this.code = code;
        this.desc = desc;
    }

    private String name;

    private String code;

    private String desc;
}
