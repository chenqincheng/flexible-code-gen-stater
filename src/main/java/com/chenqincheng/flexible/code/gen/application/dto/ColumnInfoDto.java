package com.chenqincheng.flexible.code.gen.application.dto;

import lombok.Data;

@Data
public class ColumnInfoDto {

    /**
     * 字段名称
     */
    private String columnName;

    /**
     * 数据类型
     */
    private String dataType;

    /**
     * 字段评论
     */
    private String columnComment;

    /**
     * 数字精度
     */
    private Integer numericPrecision;


    /**
     * 数字刻度
     */

    private Integer numericScale;


    /**
     * 字符串最大长度
     */
    private Integer characterMaximumLength;


    /**
     * 是否可以为空
     */
    private Boolean isNullable;


}
