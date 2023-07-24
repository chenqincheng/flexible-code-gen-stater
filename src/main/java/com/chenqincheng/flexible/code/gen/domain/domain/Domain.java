package com.chenqincheng.flexible.code.gen.domain.domain;

import com.chenqincheng.flexible.code.gen.domain.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Entity
@Slf4j
@NoArgsConstructor
public class Domain {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 编码
     */
    private String code;


    /**
     * 描述
     */
    private String description;
}
