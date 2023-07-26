package com.chenqincheng.flexible.code.gen.application.dto.domain;

import com.github.pagehelper.page.PageParams;
import lombok.Data;

@Data
public class DomainRequest {
    private String name;

    private Integer  pageNum;

    private Integer pageSize;
}
